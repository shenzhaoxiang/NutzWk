package cn.wizzer.modules.services.wx;

import cn.wizzer.common.base.Service;
import cn.wizzer.modules.models.wx.Wx_tpl_id;
import org.nutz.dao.Dao;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.log.Log;
import org.nutz.log.Logs;
@IocBean(args = {"refer:dao"})
public class WxTplIdService extends Service<Wx_tpl_id> {
	private static final Log log = Logs.get();

    public WxTplIdService(Dao dao) {
    	super(dao);
    }
}

