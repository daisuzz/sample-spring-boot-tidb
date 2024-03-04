package dev.daisuzz.samplespringboottidb;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface SampleMapper {

    @Select("SELECT 'HELLO WORLD'")
    String getHelloWorld();
}
