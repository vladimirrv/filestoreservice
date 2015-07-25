package com.foo.storeservice.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.component.cxf.CxfSpringEndpoint;
import org.apache.camel.component.cxf.common.message.CxfConstants;

public class SenderProcessor implements Processor {

    public static final String PRODUCER_NAME = "camelProducer";

    public static final String DIRECTVM_PREFIX = "direct-vm://";

    private CxfSpringEndpoint serviceClient;

    @Override
    public void process(Exchange exchange) throws Exception {
        Message msg = exchange.getIn();

        if (msg == null) {
            throw new IllegalArgumentException();
        }

        msg.setHeader(CxfConstants.OPERATION_NAME, "storeMessage");
        msg.setHeader(CxfConstants.OPERATION_NAMESPACE, "http://storeservice.foo.com");

        // String response =
        // getServiceClient().createProducer().storeMessage(body);
        Message out = exchange.getOut();
        if (null != out)
            exchange.setOut(out);
        exchange.setIn(msg);
    }

    public CxfSpringEndpoint getServiceClient() {
        return serviceClient;
    }

    public void setServiceClient(CxfSpringEndpoint serviceClient) {
        this.serviceClient = serviceClient;
    }

}
