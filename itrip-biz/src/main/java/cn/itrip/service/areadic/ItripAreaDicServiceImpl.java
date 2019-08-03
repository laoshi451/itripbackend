package cn.itrip.service.areadic;

@Service
public class ItripAreaDicServiceImpl implements ItripAreaDicService {

    @Resource
    private ItripAreaDicMapper itripAreaDicMapper;
    @Override
    public ItripAreaDic getItripAreaDicById(Long id) throws Exception {
        return itripAreaDicMapper.getItripAreaDicById(id);
    }

    @Override
    public List<ItripAreaDic> getItripAreaDicListByMap(Map<String, Object> param) throws Exception {
        return null;
    }

    @Override
    public Integer getItripAreaDicCountByMap(Map<String, Object> param) throws Exception {
        return null;
    }

    @Override
    public Integer itriptxAddItripAreaDic(ItripAreaDic itripAreaDic) throws Exception {
        return null;
    }

    @Override
    public Integer itriptxModifyItripAreaDic(ItripAreaDic itripAreaDic) throws Exception {
        return null;
    }

    @Override
    public Integer itriptxDeleteItripAreaDicById(Long id) throws Exception {
        return null;
    }

    @Override
    public Page<ItripAreaDic> queryItripAreaDicPageByMap(Map<String, Object> param, Integer pageNo, Integer pageSize) throws Exception {
        return null;
    }
}
