package cn.itrip.service.areadic;

public interface ItripAreaDicService {

    public ItripAreaDic getItripAreaDicById(Long id)throws Exception;

    public List<ItripAreaDic>	getItripAreaDicListByMap(Map<String,Object> param)throws Exception;

    public Integer getItripAreaDicCountByMap(Map<String,Object> param)throws Exception;

    public Integer itriptxAddItripAreaDic(ItripAreaDic itripAreaDic)throws Exception;

    public Integer itriptxModifyItripAreaDic(ItripAreaDic itripAreaDic)throws Exception;

    public Integer itriptxDeleteItripAreaDicById(Long id)throws Exception;

    public Page<ItripAreaDic> queryItripAreaDicPageByMap(Map<String,Object> param,Integer pageNo,Integer pageSize)throws Exception;
}
