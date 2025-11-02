import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.util.Locale;

public class PointOfSales extends JFrame {

    // --- Bagian 1: Deklarasi Komponen ---
    // Gunakan komponen yang ada di slide [cite: 17, 18, 26, 28, 31]

    // Tabel
    private JTable productTable;
    private JTable cartTable;
    private DefaultTableModel productModel;
    private DefaultTableModel cartModel;

    // Tombol
    private JButton btnAddToCart;
    private JButton btnCheckout;
    private JButton btnPrint;

    // Label
    private JLabel lblSelectedProduct;
    private JLabel lblTotal;
    private JLabel lblPoints;

    // Field
    private JTextField txtQty;
    private JTextArea txtReceipt; // [cite: 82, 124]

    // Menu Bar
    private JMenuBar menuBar; // [cite: 11]

    // Variabel untuk total
    private double currentTotal = 0.0;
    private int currentPoints = 0;
    private NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));

    public PointOfSales() {
        // --- Bagian 2: Inisialisasi Frame Utama ---
        setTitle("POIN Off-Sales - Java Swing"); // [cite: 108]
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // --- Bagian 3: Setup Menu Bar ---
        menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File"); // [cite: 109]
        JMenu helpMenu = new JMenu("Help"); // [cite: 109]
        menuBar.add(fileMenu);
        menuBar.add(helpMenu);
        setJMenuBar(menuBar);

        // --- Bagian 4: Inisialisasi Model Tabel ---

        // Model Tabel Produk (sesuai data di slide [cite: 111])
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
                return false; // Membuat tabel tidak bisa di-edit
            }
        };

        // Model Tabel Keranjang (sesuai kolom di slide [cite: 112-116])
        String[] cartColumns = {"ID", "Nama Produk", "Qty", "Harga", "Subtotal"};
        cartModel = new DefaultTableModel(null, cartColumns) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        // --- Bagian 5: Inisialisasi Komponen ---
        productTable = new JTable(productModel);
        cartTable = new JTable(cartModel);

        lblSelectedProduct = new JLabel("Pilih produk dari tabel di kiri"); // [cite: 117]
        txtQty = new JTextField("1", 5); // [cite: 118]
        btnAddToCart = new JButton("Add to Cart"); // [cite: 119]

        lblTotal = new JLabel("Total: Rp0,00"); // [cite: 120]
        lblPoints = new JLabel("Points: 0"); // [cite: 121]
        btnCheckout = new JButton("Checkout"); // [cite: 122]
        btnPrint = new JButton("Cetak"); // [cite: 123]
        txtReceipt = new JTextArea(10, 30); // [cite: 124]
        txtReceipt.setEditable(false);

        // --- Bagian 6: Penataan Layout ---
        // Menggunakan Layout Manager [cite: 36]
        // Panel utama dibagi 2: Kiri (Produk) dan Kanan (Keranjang & Struk)
        JPanel mainPanel = new JPanel(new GridLayout(1, 2, 10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Panel Kiri: Produk
        JPanel leftPanel = new JPanel(new BorderLayout(5, 5));
        leftPanel.setBorder(BorderFactory.createTitledBorder("Produk")); // [cite: 109]
        leftPanel.add(new JScrollPane(productTable), BorderLayout.CENTER);

        // Panel Kiri Bawah: Kontrol "Add to Cart"
        JPanel productControlPanel = new JPanel(new FlowLayout());
        productControlPanel.add(lblSelectedProduct);
        productControlPanel.add(new JLabel("Qty:")); // [cite: 118]
        productControlPanel.add(txtQty);
        productControlPanel.add(btnAddToCart);
        leftPanel.add(productControlPanel, BorderLayout.SOUTH);

        // Panel Kanan: Keranjang & Struk
        JPanel rightPanel = new JPanel(new BorderLayout(5, 5));
        
        // Panel Kanan Atas: Keranjang
        JPanel cartPanel = new JPanel(new BorderLayout());
        cartPanel.setBorder(BorderFactory.createTitledBorder("Keranjang")); // [cite: 110]
        cartPanel.add(new JScrollPane(cartTable), BorderLayout.CENTER);

        // Panel Kanan Bawah: Total & Struk
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

        // Menambahkan panel kiri dan kanan ke panel utama
        mainPanel.add(leftPanel);
        mainPanel.add(rightPanel);

        // Menambahkan panel utama ke JFrame
        add(mainPanel);

        // --- Bagian 7: Event Handling ---

        // Listener saat produk di tabel kiri di-klik
        productTable.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting() && productTable.getSelectedRow() != -1) {
                int selectedRow = productTable.getSelectedRow();
                String id = productModel.getValueAt(selectedRow, 0).toString();
                String name = productModel.getValueAt(selectedRow, 1).toString();
                double price = (double) productModel.getValueAt(selectedRow, 2);
                // Mengupdate label "Dipilih:" sesuai slide [cite: 140]
                lblSelectedProduct.setText(String.format("%s - %s (%s)", id, name, currencyFormat.format(price)));
            }
        });

        // Listener untuk tombol "Add to Cart" [cite: 129]
        btnAddToCart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = productTable.getSelectedRow();
                if (selectedRow == -1) {
                    JOptionPane.showMessageDialog(null, "Silakan pilih produk terlebih dahulu.");
                    return;
                }

                try {
                    int qty = Integer.parseInt(txtQty.getText());
                    if (qty <= 0) {
                        JOptionPane.showMessageDialog(null, "Kuantitas harus lebih dari 0.");
                        return;
                    }

                    String id = productModel.getValueAt(selectedRow, 0).toString();
                    String name = productModel.getValueAt(selectedRow, 1).toString();
                    double price = (double) productModel.getValueAt(selectedRow, 2);
                    double subtotal = price * qty;

                    // Menambahkan ke tabel keranjang [cite: 138]
                    cartModel.addRow(new Object[]{id, name, qty, price, subtotal});

                    // Update total
                    updateTotal();
                    
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Kuantitas harus berupa angka.");
                }
            }
        });

        // Listener untuk tombol "Checkout" [cite: 168]
        btnCheckout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cartModel.getRowCount() == 0) {
                    JOptionPane.showMessageDialog(null, "Keranjang masih kosong.");
                    return;
                }

                // Membangun struk
                StringBuilder receipt = new StringBuilder();
                receipt.append("===== POIN OFF-SALES =====\n");
                receipt.append("Toko: Demo Toko\n");
                receipt.append("--------------------------------------\n");

                for (int i = 0; i < cartModel.getRowCount(); i++) {
                    String id = cartModel.getValueAt(i, 0).toString();
                    String name = cartModel.getValueAt(i, 1).toString();
                    int qty = (int) cartModel.getValueAt(i, 2);
                    double subtotal = (double) cartModel.getValueAt(i, 4);
                    
                    // Format struk [cite: 191]
                    receipt.append(String.format("%s %s %d %s\n", id, name, qty, currencyFormat.format(subtotal)));
                }

                receipt.append("--------------------------------------\n");
                receipt.append("TOTAL:\t\t" + currencyFormat.format(currentTotal) + "\n"); // [cite: 193]
                receipt.append("POINTS DIDAPAT: " + currentPoints + " (1 point per Rp 1000)\n"); // [cite: 194]
                receipt.append("\nTerima kasih! Silakan kunjungi kembali.\n"); // [cite: 195]

                txtReceipt.setText(receipt.toString());

                // Mengosongkan keranjang dan reset total
                cartModel.setRowCount(0);
                updateTotal();
            }
        });

        // Listener untuk tombol "Cetak" (Print) [cite: 197]
        btnPrint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtReceipt.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Tidak ada struk untuk dicetak. Silakan Checkout terlebih dahulu.");
                    return;
                }

                try {
                    // Ini adalah fungsi kunci untuk mencetak
                    // Menggunakan JTextArea.print()
                    boolean didPrint = txtReceipt.print();
                    if (didPrint) {
                        JOptionPane.showMessageDialog(null, "Struk telah dikirim ke printer.");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Gagal mencetak: " + ex.getMessage());
                }
            }
        });
    }

    // Fungsi helper untuk update total
    private void updateTotal() {
        currentTotal = 0.0;
        for (int i = 0; i < cartModel.getRowCount(); i++) {
            currentTotal += (double) cartModel.getValueAt(i, 4);
        }
        
        // Kalkulasi poin [cite: 194]
        currentPoints = (int) (currentTotal / 1000); 

        lblTotal.setText("Total: " + currencyFormat.format(currentTotal)); // [cite: 143]
        lblPoints.setText("Points: " + currentPoints); // [cite: 144]
    }

    // --- Bagian 8: Main Method untuk Menjalankan ---
    public static void main(String[] args) {
        // Menjalankan GUI di Event Dispatch Thread (Best Practice)
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PointOfSales().setVisible(true);
            }
        });
    }
}