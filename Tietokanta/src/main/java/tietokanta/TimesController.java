package tietokanta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class TimesController {

	private TimesService timesService;
	
	 @Autowired
	    public void setTimesService(TimesService timesService) {
	        this.timesService = timesService;
	    }
	
	//Create

	@RequestMapping("times/new")
	public String newTimes(Model model){
		model.addAttribute("times", new Times());
		return "timesform";

	}

	@RequestMapping(value = "Times", method = RequestMethod.POST)
	public String saveTime(Times times){
		timesService.saveTimes(times);
		return "redirect:/times/" + times.getId();
	}

	//Read by Id

	@RequestMapping("times/{id}")
	public String showTimes(@PathVariable Integer id, Model model){
		model.addAttribute("times", timesService.getTimesById(id));
		return "timesshow";
	}

	//List All

	@RequestMapping(value = "/times", method = RequestMethod.GET)
	public String list(Model model){
		model.addAttribute("times", timesService.listAllTimes());
		return "times";
	}

	//Update

	@RequestMapping("times/edit/{id}")
	public String edit(@PathVariable Integer id, Model model){
		model.addAttribute("times", timesService.getTimesById(id));
		return "timesform";
	}

	
	//Save

	@RequestMapping(value = "times", method = RequestMethod.POST)
	public String saveTimes(Times times){
		timesService.saveTimes(times);
		
		return "redirect:/times/" + times.getId();
	}

	//Delete

	@RequestMapping("times/delete/{id}")
	public String delete(@PathVariable Integer id){
		timesService.deleteTimes(id);
		return "redirect:/times";
	}

	
}
