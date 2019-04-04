package tietokanta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class TimesServicelmpl implements TimesService {
	private TimesRepository timesRepository;
	
@Autowired
public void setTimesRepository(TimesRepository timesRepository){
	this.timesRepository = timesRepository;
}

@Override
public Iterable<Times> listAllTimes() {
    return timesRepository.findAll();
}

@Override
public Times getTimesById(Integer id) {
    return timesRepository.findOne(id);
}

@Override 
public Times saveTimes(Times times){
	return timesRepository.save(times);
}

@Override 
public void deleteTimes(Integer id){
	timesRepository.delete(id);
}


	
}    
