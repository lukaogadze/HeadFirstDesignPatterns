package ge.gov.smartlogic.mvc.djview.domain;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class DJViewServlet extends HttpServlet {

	private static final long serialVersionUID = 2L;

	public void init() throws ServletException {
		BeatModel beatModel = new BeatModel();
		beatModel.initialize();
		getServletContext().setAttribute("beatModel", beatModel);
	}

	public void doGet(HttpServletRequest request,
			HttpServletResponse response)
					throws IOException, ServletException
	{
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request,
			HttpServletResponse response)
					throws IOException, ServletException
	{
		BeatModel beatModel = 
				(BeatModel)getServletContext().getAttribute("beatModel");

		String bpm = request.getParameter("beatPerMinute");
		if (bpm == null) {
			bpm = beatModel.getBeatPerMinute() + "";
		}

		String set = request.getParameter("set");
		if (set != null) {
			int bpmNumber = 90;
			bpmNumber = Integer.parseInt(bpm);
			beatModel.setBeatPerMinute(bpmNumber);
		}

		String decrease = request.getParameter("decrease");
		if (decrease != null) {
			beatModel.setBeatPerMinute(beatModel.getBeatPerMinute() - 1);
		}
		String increase = request.getParameter("increase");
		if (increase != null) {
			beatModel.setBeatPerMinute(beatModel.getBeatPerMinute() + 1);
		}
		String on = request.getParameter("on");
		if (on != null) {
			beatModel.on();
		}
		String off = request.getParameter("off");
		if (off != null) {
			beatModel.off();
		}

		request.setAttribute("beatModel", beatModel);

		RequestDispatcher dispatcher = 
				request.getRequestDispatcher("/djview.jsp");
		dispatcher.forward(request, response);

	}


}
