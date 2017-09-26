/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package report;

import java.awt.Desktop;
import java.io.File;
import java.io.InputStream;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

/**
 *
 * @author adhi
 */
public class ReportLoader {
    
    private Connection connection;
    
    public ReportLoader(){
        
    }

    public void print(String pOrderId, Connection pConnection) {

        pConnection = connection;
        String reportName;
        String fullPath;
        String[] isiDir;
        String reportDir;
        JasperPrint JPrint;
        JasperExportManager ekspor;
        JasperReport JRpt;

        try {
//            this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));

            Properties systemProp = System.getProperties();

            // Ambil current dir
            String currentDir = systemProp.getProperty("user.dir");

            File dir = new File(currentDir);
            reportName = "surat_permintaan.jrxml";
            String reportDirName = "report";

            File fileRpt;
            fullPath = "report/surat_permintaan.jasper";
            if (dir.isDirectory()) {
                isiDir = dir.list();
                for (int i = 0; i < isiDir.length; i++) {
                    fileRpt = new File(currentDir + File.separatorChar + isiDir[i] + File.separatorChar
                            + reportDirName + File.separatorChar + reportName);

                    if (fileRpt.isFile()) { // Cek apakah file RptMaster.jrxml ada
                        fullPath = fileRpt.toString();
                        System.out.println("Found Report File at : " + fullPath);
                    } // end if
                } // end for i
            } // end if

            // Ambil Direktori tempat file RptMaster.jrxml berada
            String[] subRptDir = fullPath.split(reportName);
            reportDir = subRptDir[0];
            System.out.println("Report Directory at : " + reportDir);

            // Ambil Kode Kategori
            String result = "";
            String fileName = "/report/surat_permintaan.jasper";

            ClassLoader classLoader = getClass().getClassLoader();
            InputStream in = this.getClass().getClassLoader().getResourceAsStream(fileName);

            final String paramKdKategori = pOrderId;
            Connection con = null;
            try {
                // Persiapkan parameter untuk Report
                Map parameters = new HashMap();
                parameters.put("orderId", paramKdKategori);
                parameters.put("SUBREPORT_DIR", reportDir);

                try {
                    JRpt = JasperCompileManager.compileReport(in);
                    JPrint = JasperFillManager.fillReport(JRpt, parameters, pConnection);
                    JasperExportManager.exportReportToPdfFile(JPrint, "D://surat_permintaan.pdf");
                    File dir1 = new File("D://surat_permintaan.pdf");
                    Desktop.getDesktop().print(dir1);
                } catch (Exception rptexcpt) {
                    System.out.println("Report Can't view because : " + rptexcpt);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
//            this.setCursor(Cursor.getDefaultCursor());
        } catch (Exception e) {
//            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }

    }
}
