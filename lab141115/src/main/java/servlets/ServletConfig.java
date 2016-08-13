package servlets;

import javax.annotation.Resource;
import javax.jms.Queue;
import javax.jms.Topic;

public class ServletConfig {

	@Resource
    private Queue queuePedido;

    @Resource
    private Topic topicVenda;

}
