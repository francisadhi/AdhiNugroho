package action;

import com.dao.ComVolumeKantongDao;
import com.entity.ComVolumeKantong;
import entity.StaffPmi;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import service.ConnectionMySQL;

/**
 *
 * @author mazipan
 */
public class ComVolumeKantongDelete implements ActionInterface {

    @Override
    public String execute(HttpServletRequest request) {
        HttpSession session = request.getSession(true);
        StaffPmi staffPmi = (StaffPmi) session.getAttribute("loginasStaffPmi");
        String msg = "Failed to delete comVolumeKantong";
        List<ComVolumeKantong> comVolumeKantongs = new ArrayList<>();

        if (staffPmi != null) {
            try {
                ComVolumeKantongDao comVolumeKantongDAO = ConnectionMySQL.getComVolumeKantongDao();

                try {

                    String idStr = request.getParameter("id");
                    if (idStr != null) {
                        Integer idComVolumeKantong = Integer.parseInt(idStr);
                        System.out.println("idcomVolumeKantong delete : " + idComVolumeKantong);
                        ComVolumeKantong comVolumeKantong = comVolumeKantongDAO.getComVolumeKantongById(idComVolumeKantong);

                        comVolumeKantongDAO.delete(idComVolumeKantong);
                        msg = "comVolumeKantong has been delete";

                        try {
                            comVolumeKantongs = comVolumeKantongDAO.selectAll();
                        } catch (Exception ex) {
                        }

                        msg = "ComVolumeKantong has been saved";
                        request.setAttribute("comVolumeKantongs", comVolumeKantongs);

                    }

                } catch (Exception ex) {
                    msg = "Failed to delete comVolumeKantong " + ex.getMessage();
//                    Logger.getLogger(AdminCategory.class.getName()).log(Level.SEVERE, null, ex);
                }

            } catch (SQLException ex) {
                msg = "Failed to delete comVolumeKantong " + ex.getMessage();
//                Logger.getLogger(AdminCategory.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            return "index.jsp";
        }

        request.setAttribute("msg", msg);
        return "comVolumeKantongList.jsp";

    }

}
