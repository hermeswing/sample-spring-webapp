package spring.simple.test.sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.simple.test.sample.mapper.SampleMapper;
import spring.simple.test.sample.vo.SampleVo;

// @Service(value = "sampleService")
@Service
public class SampleService {
    @Autowired
    private SampleMapper sampleMapper;
    
    public List<SampleVo> getAll() {
        return this.sampleMapper.getAll();
    }
    
    public SampleVo get(int sampleNo) {
        return this.sampleMapper.get(sampleNo);
    }
    
    public void add(SampleVo sampleVo) {
        this.sampleMapper.add(sampleVo);
    }
    
    public void update(SampleVo sampleVo) {
        this.sampleMapper.update(sampleVo);
    }
    
    public void delete(int sampleNo) {
        this.sampleMapper.delete(sampleNo);
    }
}
