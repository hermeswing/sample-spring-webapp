package spring.simple.test.sample.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import spring.simple.test.sample.vo.SampleVo;

//@Repository(value = "sampleMapper")
@Repository
public interface SampleMapper {
    List<SampleVo> getAll();
    
    SampleVo get(int sampleNo);
    
    void add(SampleVo sampleVo);
    
    void update(SampleVo sampleVo);
    
    void delete(int sampleVo);
}
