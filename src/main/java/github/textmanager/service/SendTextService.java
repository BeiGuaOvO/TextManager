package github.textmanager.service;

import com.alibaba.fastjson.JSON;
import github.textmanager.entity.Text;
import github.textmanager.utils.HttpRequestUtil;

import java.util.List;

public class SendTextService {
    public static void send(Text text,List<String> servers){
        String jsonStr = JSON.toJSONString(text);
        for (String server:servers){
            HttpRequestUtil.doPost(server,jsonStr);
        }
    }
}
