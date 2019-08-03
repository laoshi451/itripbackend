package cn.itrip.dao.areadic;

public interface ItripAreaDicMapper {
    public ItripAreaDic getItripAreaDicById(@Param(value = "id") Long id)throws Exception;

    public List<ItripAreaDic>	getItripAreaDicListByMap(Map<String,Object> param)throws Exception;

    public Integer getItripAreaDicCountByMap(Map<String,Object> param)throws Exception;

    public Integer insertItripAreaDic(ItripAreaDic itripAreaDic)throws Exception;

    public Integer updateItripAreaDic(ItripAreaDic itripAreaDic)throws Exception;

    public Integer deleteItripAreaDicById(@Param(value = "id") Long id)throws Exception;
}
