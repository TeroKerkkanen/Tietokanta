package tietokanta;

public interface TimesService {

    Iterable<Times> listAllTimes();
    
    Times getTimesById(Integer id);
 
    Times saveTimes(Times times);
 
    void deleteTimes(Integer id);

	
}
