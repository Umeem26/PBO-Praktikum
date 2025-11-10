package pos;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
// Import ini diperlukan untuk memperbaiki peringatan SonarQube (S2583)
import javax.swing.WindowConstants; 
// Baris 'import java.awt.event.ActionEvent;' telah dihapus
import java.text.NumberFormat;
import java.util.Locale;

public class PointOfSales extends JFrame {

    // --- Bagian 1: Deklarasi Komponen ---
    private JTable productTable;
    private JTable cartTable;
    private DefaultTableModel productModel;
    private DefaultTableModel cartModel;
    private JButton btnAddToCart;
    private JButton btnCheckout;
    private JButton btnPrint;
    private JLabel lblSelectedProduct;
    private JLabel lblTotal;
    private JLabel lblPoints;
    private JTextField txtQty;
    private JTextArea txtReceipt;

    // --- Variabel ---
    private double currentTotal = 0.0;
    private int currentPoints = 0;
    private NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.of("id", "ID"));

    // --- Konstruktor Utama ---
    public PointOfSales() {
        initializeFrame();
        setupMenuBar();
        initializeModels();
        initializeComponents();
        setupLayout();
        setupListeners(); // Menggabungkan semua setup listener
    }

    // --- Inisialisasi Frame ---
    private void initializeFrame() {
        setTitle("POIN Off-Sales - Java Swing");
        setSize(800, 600);
        // PERBAIKAN (S2583): Menggunakan WindowConstants
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void setupMenuBar() {
        JMenuBar mainMenuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu helpMenu = new JMenu("Help");
        mainMenuBar.add(fileMenu);
        mainMenuBar.add(helpMenu);
        setJMenuBar(mainMenuBar);
    }

    // --- Inisialisasi Model Tabel ---
    private void initializeModels() {
        // Model Tabel Produk
        String[] productColumns = {"ID", "Nama Produk", "Harga (Rp)"};
        Object[][] productData = {
                {"P001", "Air Mineral 600ml", 3000.0},
                {"P002", "Kopi Sachet", 5000.0},
                {"P003", "Roti isi", 8000.0},
                {"P004", "Snack Keripik", 6000.0},
                {"P005", "Minuman Botol", 12000.0}
        };
        productModel = new DefaultTableModel(productData, productColumns) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        // Model Tabel Keranjang
        String[] cartColumns = {"ID", "Nama Produk", "Qty", "Harga", "Subtotal"};
        cartModel = new DefaultTableModel(null, cartColumns) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
    }

    // --- Inisialisasi Komponen ---
    private void initializeComponents() {
        productTable = new JTable(productModel);
        cartTable = new JTable(cartModel);
        lblSelectedProduct = new JLabel("Pilih produk dari tabel di kiri");
        txtQty = new JTextField("1", 5);
        btnAddToCart = new JButton("Add to Cart");
        lblTotal = new JLabel("Total: Rp0,00");
        lblPoints = new JLabel("Points: 0");
        btnCheckout = new JButton("Checkout");
        btnPrint = new JButton("Cetak");
        txtReceipt = new JTextArea(10, 30);
        txtReceipt.setEditable(false);
    }

    // --- Penataan Layout ---
    private void setupLayout() {
        JPanel mainPanel = new JPanel(new GridLayout(1, 2, 10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Panel Kiri: Produk
        JPanel leftPanel = new JPanel(new BorderLayout(5, 5));
        leftPanel.setBorder(BorderFactory.createTitledBorder("Produk"));
        leftPanel.add(new JScrollPane(productTable), BorderLayout.CENTER);
        
        JPanel productControlPanel = new JPanel(new FlowLayout());
        productControlPanel.add(lblSelectedProduct);
        productControlPanel.add(new JLabel("Qty:"));
        productControlPanel.add(txtQty);
        productControlPanel.add(btnAddToCart);
        leftPanel.add(productControlPanel, BorderLayout.SOUTH);

        // Panel Kanan: Keranjang & Struk
        JPanel rightPanel = new JPanel(new BorderLayout(5, 5));
        JPanel cartPanel = new JPanel(new BorderLayout());
        cartPanel.setBorder(BorderFactory.createTitledBorder("Keranjang"));
        cartPanel.add(new JScrollPane(cartTable), BorderLayout.CENTER);

        JPanel bottomRigthPanel = new JPanel(new BorderLayout());
        JPanel checkoutPanel = new JPanel(new FlowLayout());
        checkoutPanel.add(lblTotal);
        checkoutPanel.add(lblPoints);
        checkoutPanel.add(btnCheckout);
        checkoutPanel.add(btnPrint);

        bottomRigthPanel.add(checkoutPanel, BorderLayout.NORTH);
        bottomRigthPanel.add(new JScrollPane(txtReceipt), BorderLayout.CENTER);
        
        rightPanel.add(cartPanel, BorderLayout.CENTER);
        rightPanel.add(bottomRigthPanel, BorderLayout.SOUTH);

        mainPanel.add(leftPanel);
        mainPanel.add(rightPanel);
        add(mainPanel);
    }

    // --- Event Handling ---
    private void setupListeners() {
        
        // Listener Tabel Produk
        productTable.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting() && productTable.getSelectedRow() != -1) {
                handleProductSelection();
            }
        });

        btnAddToCart.addActionListener(e -> handleAddToCart());
        
        btnCheckout.addActionListener(e -> handleCheckout());
        
        btnPrint.addActionListener(e -> handlePrint());
    }

    /**
     * Logika yang diekstrak dari listener pemilihan tabel
     */
    private void handleProductSelection() {
        int selectedRow = productTable.getSelectedRow();
        String id = productModel.getValueAt(selectedRow, 0).toString();
        String name = productModel.getValueAt(selectedRow, 1).toString();
        double price = (double) productModel.getValueAt(selectedRow, 2);
        lblSelectedProduct.setText(String.format("%s - %s (%s)", id, name, currencyFormat.format(price)));
    }

    /**
     * Logika yang diekstrak dari listener tombol Add to Cart
     */
    private void handleAddToCart() {
        int selectedRow = productTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Silakan pilih produk terlebih dahulu.");
            return;
        }

        try {
            int qty = Integer.parseInt(txtQty.getText());
            if (qty <= 0) {
                JOptionPane.showMessageDialog(this, "Kuantitas harus lebih dari 0.");
                return;
            }

            String id = productModel.getValueAt(selectedRow, 0).toString();
            String name = productModel.getValueAt(selectedRow, 1).toString();
            double price = (double) productModel.getValueAt(selectedRow, 2);
            double subtotal = price * qty;

            cartModel.addRow(new Object[]{id, name, qty, price, subtotal});
            updateTotal();
            
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Kuantitas harus berupa angka.");
        }
    }

    /**
     * Logika yang diekstrak dari listener tombol Checkout
     */
    private void handleCheckout() {
        if (cartModel.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Keranjang masih kosong.");
            return;
        }

        StringBuilder receipt = new StringBuilder();
        receipt.append("===== POIN OFF-SALES =====\n");
        receipt.append("Toko: Demo Toko\n");
        receipt.append("--------------------------------------\n");

        for (int i = 0; i < cartModel.getRowCount(); i++) {
            String id = cartModel.getValueAt(i, 0).toString();
            String name = cartModel.getValueAt(i, 1).toString();
            int qty = (int) cartModel.getValueAt(i, 2);
            double subtotal = (double) cartModel.getValueAt(i, 4);
            receipt.append(String.format("%s %s %d %s%n", id, name, qty, currencyFormat.format(subtotal)));
        }

        receipt.append("--------------------------------------\n");
        receipt.append("TOTAL:\t\t" + currencyFormat.format(currentTotal) + "\n");
        receipt.append("POINTS DIDAPAT: " + currentPoints + " (1 point per Rp 1000)\n");
        receipt.append("\nTerima kasih! Silakan kunjungi kembali.\n");

        txtReceipt.setText(receipt.toString());
        cartModel.setRowCount(0);
        updateTotal();
    }

    /**
     * Logika yang diekstrak dari listener tombol Print
     */
    private void handlePrint() {
        if (txtReceipt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tidak ada struk untuk dicetak. Silakan Checkout terlebih dahulu.");
            return;
        }

        try {
            boolean didPrint = txtReceipt.print();
            if (didPrint) {
                JOptionPane.showMessageDialog(this, "Struk telah dikirim ke printer.");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Gagal mencetak: " + ex.getMessage());
        }
    }

    // --- Fungsi Helper ---
    private void updateTotal() {
        currentTotal = 0.0;
        for (int i = 0; i < cartModel.getRowCount(); i++) {
            currentTotal += (double) cartModel.getValueAt(i, 4);
        }
        
        currentPoints = (int) (currentTotal / 1000); 
        lblTotal.setText("Total: " + currencyFormat.format(currentTotal));
        lblPoints.setText("Points: " + currentPoints);
    }

    // --- Main Method ---
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PointOfSales().setVisible(true));
    }
}