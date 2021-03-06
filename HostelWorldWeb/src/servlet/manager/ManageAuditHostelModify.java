package servlet.manager;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import factory.EJBFactory;
import model.Audit;
import model.enumerate.SubmitState;
import model.enumerate.SubmitType;
import service.AuditService;

/**
 * Servlet implementation class ManageAuditHostel
 */
@WebServlet("/manager/audit/modify")
public class ManageAuditHostelModify extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AuditService auditService = EJBFactory.getServiceEJB(AuditService.class);

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Audit> audits = auditService.getAudits(SubmitType.EDIT, SubmitState.NOT_AUDIT);
		HttpSession session = request.getSession();
		session.setAttribute("audits", audits);
		ServletContext context = getServletContext();
		context.getRequestDispatcher("/manager/auditModify.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
