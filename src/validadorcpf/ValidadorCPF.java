package validadorcpf;

import java.awt.HeadlessException;
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

public class ValidadorCPF {

    boolean resolvido = false;
    public int[] v = new int[11];
    String CPF;
    public String CPFbuffer;
    public String CPF1;
    int v1;
    int v2;
    int v3;
    int v4;
    int v5;
    int v6;
    int v7;
    int v8;
    int v9;
    public int v10;
    public int v11;

    public int[] y = new int[14];
    String CNPJ;
    public String CNPJbuffer;
    public String CNPJ1;
    int y1;
    int y2;
    int y3;
    int y4;
    int y5;
    int y6;
    int y7;
    int y8;
    public int y9;
    public int y10;
    public int y11;
    public int y12;
    public int y13;
    public int y14;

    public int[] x = new int[9];
    String RG;
    public String RGbuffer;
    public String RG1;
    public String RG7;
    public String RG8;
    int x1;
    int x2;
    int x3;
    int x4;
    int x5;
    int x6;
    int x7;
    public int x8;
    public int x9;

    public static void main(String[] args) {
        System.out.println("Digite o CPF");

    }

    public void carregavalor(String CPF) {

        for (int i = 0; i <= 10; i++) {
            try {
                v[i] = Character.getNumericValue(CPF.charAt(i));
            } catch (Exception ex) {
            }
        }
        v1 = Character.getNumericValue(CPF.charAt(0));
        v2 = Character.getNumericValue(CPF.charAt(1));
        v3 = Character.getNumericValue(CPF.charAt(2));
        v4 = Character.getNumericValue(CPF.charAt(3));
        v5 = Character.getNumericValue(CPF.charAt(4));
        v6 = Character.getNumericValue(CPF.charAt(5));
        v7 = Character.getNumericValue(CPF.charAt(6));
        v8 = Character.getNumericValue(CPF.charAt(7));
        v9 = Character.getNumericValue(CPF.charAt(8));
        try {
            v10 = Character.getNumericValue(CPF.charAt(9));
            v11 = Character.getNumericValue(CPF.charAt(10));
        } catch (Exception ex) {
        }

    }

    public void carregavalorrg(String RG) {

        for (int i = 0; i < 9; i++) {
            try {
                x[i] = Character.getNumericValue(RG.charAt(i));
            } catch (Exception ex) {
            }
        }

        x1 = Character.getNumericValue(RG.charAt(0));
        x2 = Character.getNumericValue(RG.charAt(1));
        x3 = Character.getNumericValue(RG.charAt(2));
        x4 = Character.getNumericValue(RG.charAt(3));
        x5 = Character.getNumericValue(RG.charAt(4));
        x6 = Character.getNumericValue(RG.charAt(5));
        x7 = Character.getNumericValue(RG.charAt(6));
        try {
            x8 = Character.getNumericValue(RG.charAt(7));
            x9 = Character.getNumericValue(RG.charAt(8));
        } catch (Exception e) {
        }
    }

    public void carregavalorcnpj(String CNPJ) {

        for (int i = 0; i <= 13; i++) {
            try {
                y[i] = Character.getNumericValue(CNPJ.charAt(i));
            } catch (Exception ex) {
            }
        }
        y1 = Character.getNumericValue(CNPJ.charAt(0));
        y2 = Character.getNumericValue(CNPJ.charAt(1));
        y3 = Character.getNumericValue(CNPJ.charAt(2));
        y4 = Character.getNumericValue(CNPJ.charAt(3));
        y5 = Character.getNumericValue(CNPJ.charAt(4));
        y6 = Character.getNumericValue(CNPJ.charAt(5));
        y7 = Character.getNumericValue(CNPJ.charAt(6));
        y8 = Character.getNumericValue(CNPJ.charAt(7));
        try {
            y9 = Character.getNumericValue(CNPJ.charAt(8));
            y10 = Character.getNumericValue(CNPJ.charAt(9));
            y11 = Character.getNumericValue(CNPJ.charAt(10));
            y12 = Character.getNumericValue(CNPJ.charAt(11));
            y13 = Character.getNumericValue(CNPJ.charAt(12));
            y14 = Character.getNumericValue(CNPJ.charAt(13));
        } catch (Exception ex) {
        }

    }

    public void digito1(String CPF) {
        carregavalor(CPF);
        v10 = ((v1 * 1) + (v2 * 2) + (v3 * 3) + (v4 * 4) + (v5 * 5) + (v6 * 6) + (v7 * 7) + (v8 * 8) + (v9 * 9)) % 11;
        if (v10 == 10) {
            v10 = 0;
        }
    }

    public void metodo2digito1(String CPF) {

        v10 = ((v1 * 1) + (v2 * 2) + (v3 * 3) + (v4 * 4) + (v5 * 5) + (v6 * 6) + (v7 * 7) + (v8 * 8) + (v9 * 9)) % 11;
        if (v10 >= 10) {
            v10 = 0;
        }
    }

    public void digito2() {
        v11 = ((v1 * 0) + (v2 * 1) + (v3 * 2) + (v4 * 3) + (v5 * 4) + (v6 * 5) + (v7 * 6) + (v8 * 7) + (v9 * 8) + (v10 * 9)) % 11;
        if (v11 >= 10) {
            v11 = 0;
        }
    }

    public void digito1cnpj8(String CNPJ) {
        carregavalorcnpj(CNPJ);
        y13 = (((y1 * 5) + (y2 * 4) + (y3 * 3) + (y4 * 2) + (y5 * 9) + (y6 * 8) + (y7 * 7) + (y8 * 6) + (0 * 5) + (0 * 4) + (0 * 3) + (1 * 2)) % 11);

        //y13 = y13 *(-1);
        if (y13 < 2) {
            y13 = 0;
        } else {

            y13 = 11 - y13;
        }

    }

    public void digito1cnpj12(String CNPJ) {
        carregavalorcnpj(CNPJ);
        y13 = (((y1 * 5) + (y2 * 4) + (y3 * 3) + (y4 * 2) + (y5 * 9) + (y6 * 8) + (y7 * 7) + (y8 * 6) + (y9 * 5) + (y10 * 4) + (y11 * 3) + (y12 * 2)) % 11);

        if (y13 < 2) {
            y13 = 0;
        } else {

            y13 = 11 - y13;
        }

    }

    public void digito2cnpj8() {
        y14 = ((y1 * 6) + (y2 * 5) + (y3 * 4) + (y4 * 3) + (y5 * 2) + (y6 * 9) + (y7 * 8) + (y8 * 7) + (0 * 6) + (0 * 5) + (0 * 4) + (1 * 3) + (y13 * 2)) % 11;
        if (y14 < 2) {
            y14 = 0;
        } else {

            y14 = 11 - y14;
        }

    }

    public void digito2cnpj12() {
        y14 = ((y1 * 6) + (y2 * 5) + (y3 * 4) + (y4 * 3) + (y5 * 2) + (y6 * 9) + (y7 * 8) + (y8 * 7) + (y9 * 6) + (y10 * 5) + (y11 * 4) + (y12 * 3) + (y13 * 2)) % 11;
        if (y14 < 2) {
            y14 = 0;
        } else {

            y14 = 11 - y14;
        }

    }

    public void digitorg1() {
        x9 = (((x1 * 9) + (x2 * 8) + (x3 * 7) + (x4 * 6) + (x5 * 5) + (x6 * 4) + (x7 * 3) + (x8 * 2)) % 11);

        if (x9 >= 10) {
            x9 = 0;
        }
    }

    public void digitorg7(String RG7) {
        carregavalorrg(RG7);
        x8 = ((x1 * 8) + (x2 * 7) + (x3 * 6) + (x4 * 5) + (x5 * 4) + (x6 * 3) + (x7 * 2)) % 11;
        if (x8 >= 10) {
            x8 = 0;
        }
    }

    public void digitorg8(String RG8) {
        carregavalorrg(RG8);
        x9 = ((x1 * 9) + (x2 * 8) + (x3 * 7) + (x4 * 6) + (x5 * 5) + (x6 * 4) + (x7 * 3) + (x8 * 2)) % 11;
        if (x9 >= 10) {
            x9 = 0;
        }
    }

    public boolean validadigitosbtn(String CPF) {
        digito1(CPF);
        digito2();

        return Character.getNumericValue(CPF.charAt(9)) == v10 && Character.getNumericValue(CPF.charAt(10)) == v11;
    }

    public boolean validadigitos(String CPF) {
        metodo2digito1(CPF);
        digito2();

        return Character.getNumericValue(CPF.charAt(9)) == v10 && Character.getNumericValue(CPF.charAt(10)) == v11;
    }

    public boolean validadigitoscnpj12(String CNPJ) {
        digito1cnpj12(CNPJ);
        digito2cnpj12();

        return Character.getNumericValue(CNPJ.charAt(12)) == y13 && Character.getNumericValue(CNPJ.charAt(13)) == y14;
    }

    public boolean validadigitosrg7(String RG) {
        digitorg7(RG);
        return Character.getNumericValue(RG.charAt(7)) == x8;
    }

    public boolean validadigitosrg8(String RG) {
        digitorg8(RG);
        return Character.getNumericValue(RG.charAt(8)) == x9;
    }

    public void gerarsimilares(String CPF11) {
        System.out.println("Entrada = ''" + CPF11 + "''");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= 10; j++) {
                carregavalor(CPF11);
                v[j] = v[j] + (int) i;

                if (v[j] >= 10) {
                    v[j] = 0;
                }

                CPF1 = (v[0] + "" + v[1] + "" + v[2] + "" + v[3] + "" + v[4] + "" + v[5] + "" + v[6] + "" + v[7] + "" + v[8] + "" + v[9] + "" + v[10]);

                carregavalor(CPF1);
                metodo2digito1(CPF1);
                digito2();
                if (validadigitos(CPF1) == true) {
                    if (CPF11.equals(CPF1)) {
                        JOptionPane.showMessageDialog(null, "O CPF informado já está correto!");
                        CPFbuffer = CPF1;
                    } else {
                        JOptionPane.showMessageDialog(null, CPF1);
                        System.out.println(CPF1 + " = CPF ''Descoberto'' 1 casa");
                        CPFbuffer = CPF1;
                        copytoclipboard(CPFbuffer);
                    }
                    resolvido = true;

                    break;

                }

            }
            if (resolvido) {
                resolvido = false;
                break;
            }

            for (int k = 0; k <= 10; k++) {
                carregavalor(CPF11);

                if (v[k] - (int) i >= 0) {
                    v[k] = v[k] - (int) i;
                }

                if (v[k] >= 10 && v[k] < 0) {
                    v[k] = 0;
                }

                CPF1 = (v[0] + "" + v[1] + "" + v[2] + "" + v[3] + "" + v[4] + "" + v[5] + "" + v[6] + "" + v[7] + "" + v[8] + "" + v[9] + "" + v[10]);
                carregavalor(CPF1);
                metodo2digito1(CPF1);
                digito2();
                if (validadigitos(CPF1) == true) {
                    JOptionPane.showMessageDialog(null, CPF1);
                    System.out.println(CPF1 + " = CPF ''Descoberto'' 2 casas");
                    CPFbuffer = CPF1;
                    copytoclipboard(CPFbuffer);
                    resolvido = true;
                    break;
                }

            }

        }
    }

    public void gerarsimilarescnpj(String CNPJ14) {
        System.out.println("Entrada = '" + CNPJ14 + "'");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= 13; j++) {
                carregavalorcnpj(CNPJ14);
                y[j] = y[j] + (int) i;

                if (y[j] >= 10) {
                    y[j] = 0;
                }

                CNPJ1 = (y[0] + "" + y[1] + "" + y[2] + "" + y[3] + "" + y[4] + "" + y[5] + "" + y[6] + "" + y[7] + "" + y[8] + "" + y[9] + "" + y[10] + "" + y[11] + "" + y[12] + "" + y[13]);

                carregavalorcnpj(CNPJ1);
                digito1cnpj12(CNPJ1);
                digito2cnpj12();
                if (validadigitoscnpj12(CNPJ1) == true) {
                    if (CNPJ14.equals(CNPJ1)) {
                        JOptionPane.showMessageDialog(null, "O CPF informado já está correto!");
                        CNPJbuffer = CNPJ1;
                    } else {
                        JOptionPane.showMessageDialog(null, CNPJ1);
                        System.out.println(CNPJ1 + " = CPF ''Descoberto'' 1 casa");
                        CNPJbuffer = CNPJ1;
                        copytoclipboard(CNPJbuffer);
                    }
                    resolvido = true;

                    break;

                }

            }
            if (resolvido) {
                resolvido = false;
                break;
            }

            for (int k = 0; k <= 13; k++) {
                carregavalorcnpj(CNPJ14);

                if (y[k] - (int) i >= 0) {
                    y[k] = y[k] - (int) i;
                }

                if (y[k] >= 10 && y[k] < 0) {
                    y[k] = 0;
                }

                CNPJ1 = (y[0] + "" + y[1] + "" + y[2] + "" + y[3] + "" + y[4] + "" + y[5] + "" + y[6] + "" + y[7] + "" + y[8] + "" + y[9] + "" + y[10] + "" + y[11] + "" + y13 + "" + y14);
                carregavalorcnpj(CNPJ1);
                digito1cnpj12(CNPJ1);
                digito2cnpj12();
                if (validadigitoscnpj12(CNPJ1) == true) {
                    JOptionPane.showMessageDialog(null, CNPJ1);
                    System.out.println(CNPJ1 + " = CPF ''Descoberto'' 2 casas");
                    CNPJbuffer = CNPJ1;
                    copytoclipboard(CNPJbuffer);
                    resolvido = true;
                    break;
                }

            }

        }
    }

    public void gerarsimilaresrg() {
    }

    public void gerarsimilaresrg7(String RG7) {
        System.out.println("Entrada = '" + RG7 + "'");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= 7; j++) {
                carregavalorrg(RG7);
                x[j] = x[j] + (int) i;

                if (x[j] >= 10) {
                    x[j] = 0;
                }

                RG1 = (x[0] + "" + x[1] + "" + x[2] + "" + x[3] + "" + x[4] + "" + x[5] + "" + x[6] + "" + x[7]);

                carregavalorrg(RG1);
                digitorg7(RG1);
                if (validadigitosrg7(RG1) == true) {
                    if (RG7.equals(RG1)) {
                        JOptionPane.showMessageDialog(null, "O RG informado já está correto!");
                        RGbuffer = RG1;
                    } else {
                        JOptionPane.showMessageDialog(null, RG1);
                        System.out.println(RG1 + " = RG ''Descoberto'' 1 casa RG 7 dig");
                        RGbuffer = RG1;
                        copytoclipboard(RGbuffer);
                    }
                    resolvido = true;

                    break;
                }
            }

            if (resolvido) {
                resolvido = false;
                break;
            }

            for (int k = 0; k <= 7; k++) {
                carregavalorcnpj(RG1);

                if (x[k] - (int) i >= 0) {
                    x[k] = y[k] - (int) i;
                }

                if (x[k] >= 10 && x[k] < 0) {
                    x[k] = 0;
                }

                RG1 = (x[0] + "" + x[1] + "" + x[2] + "" + x[3] + "" + x[4] + "" + x[5] + "" + x[6] + "" + x[7]);
                carregavalorrg(RG1);
                digitorg7(RG1);
                if (validadigitosrg7(RG1) == true) {
                    JOptionPane.showMessageDialog(null, RG1);
                    System.out.println(RG1 + " = RG ''Descoberto'' 2 casas RG 7 dig");
                    RGbuffer = RG1;
                    copytoclipboard(RGbuffer);
                    resolvido = true;
                    break;
                }

            }
        }
    }

    public void gerarsimilaresrg8(String RG8) {
        System.out.println("Entrada = '" + RG8 + "'");
        System.out.println("Entrada = '" + RG8 + "'");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= 8; j++) {
                carregavalorrg(RG8);
                x[j] = x[j] + (int) i;

                if (x[j] >= 10) {
                    x[j] = 0;
                }

                RG1 = (x[0] + "" + x[1] + "" + x[2] + "" + x[3] + "" + x[4] + "" + x[5] + "" + x[6] + "" + x[7] + "" + x[8]);

                carregavalorrg(RG1);
                digitorg7(RG1);
                if (validadigitosrg7(RG1) == true) {
                    if (RG8.equals(RG1)) {
                        JOptionPane.showMessageDialog(null, "O RG informado já está correto!");
                        RGbuffer = RG1;
                    } else {
                        JOptionPane.showMessageDialog(null, RG1);
                        System.out.println(RG1 + " = RG ''Descoberto'' 1 casa RG 8 dig");
                        RGbuffer = RG1;
                        copytoclipboard(RGbuffer);
                    }
                    resolvido = true;

                    break;

                }
            }

            if (resolvido) {
                resolvido = false;
                break;
            }

            for (int k = 0; k <= 8; k++) {
                carregavalorcnpj(RG1);

                if (x[k] - (int) i >= 0) {
                    x[k] = y[k] - (int) i;
                }

                if (x[k] >= 10 && x[k] < 0) {
                    x[k] = 0;
                }

                RG1 = (x[0] + "" + x[1] + "" + x[2] + "" + x[3] + "" + x[4] + "" + x[5] + "" + x[6] + "" + x[7] + "" + x[8]);
                carregavalorrg(RG1);
                digitorg7(RG1);
                if (validadigitosrg7(RG1) == true) {
                    JOptionPane.showMessageDialog(null, RG1);
                    System.out.println(RG1 + " = RG ''Descoberto'' 2 casas RG8 dig");
                    RGbuffer = RG1;
                    copytoclipboard(RGbuffer);
                    resolvido = true;
                    break;
                }
            }
        }
    }

    public void copytoclipboard(String Str) {
        try {
            StringSelection stringSelection = new StringSelection(Str);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, null);
        } catch (Exception ex) {
            Logger.getLogger(ValidadorCPF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
