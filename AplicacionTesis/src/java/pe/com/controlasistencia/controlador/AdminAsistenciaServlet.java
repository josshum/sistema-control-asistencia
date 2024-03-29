package pe.com.controlasistencia.controlador;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import pe.com.controlasistencia.entities.Curso;
import pe.com.controlasistencia.services.CursoServices;
import pe.com.controlasistencia.services.UsuarioServices;
import pe.com.controlasistencia.util.SpringUtils;

public class AdminAsistenciaServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
        CursoServices cursoServices = (CursoServices) SpringUtils.getBean("cursoServices");
        UsuarioServices usuarioServices = (UsuarioServices) SpringUtils.getBean("usuarioServices");
        Logger log = Logger.getLogger(AdminAsistenciaServlet.class);
               
        
        if(request.getServletPath().equals("/AdminAsistenciaServlet")){  
           
           List<Curso> listaCursos = usuarioServices.get(8).getCursoList();
           
           request.setAttribute("listaCurso", listaCursos);
           request.getRequestDispatcher(null).forward(request, response);
           
           
           /*
           log.info("ingresando");
           System.out.println("ingresto");
           System.out.println(cursoServices.listar());
           */
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
