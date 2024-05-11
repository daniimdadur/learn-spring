package bootcampjavapamarican.spring.core.data;

import bootcampjavapamarican.spring.core.aware.IdAware;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Getter
@Component
public class Car implements IdAware {

    private String id;


    @Override
    public void setId(String id) {
        this.id = id;
    }
}
