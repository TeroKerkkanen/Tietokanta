package tietokanta;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class TimesLoader implements ApplicationListener<ContextRefreshedEvent> {
	 private TimesRepository timesRepository;
	 
	    private Logger log = Logger.getLogger(TimesLoader.class);
	 
	    @Autowired
	    public void setTimesRepository(TimesRepository timesRepository) {
	        this.timesRepository = timesRepository;
	    }
	    
@Override
public void onApplicationEvent(ContextRefreshedEvent event){

	
	
}
	
}
