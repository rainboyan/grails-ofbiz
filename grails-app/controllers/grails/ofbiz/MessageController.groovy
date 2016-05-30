package grails.ofbiz

import org.ofbiz.base.util.UtilMisc
import org.ofbiz.entity.Delegator

import org.ofbiz.entity.GenericEntityException
import org.ofbiz.entity.GenericValue
import org.ofbiz.entity.util.EntityQuery


class MessageController {

	def delegator

    def index() { 
    	def messages = EntityQuery.use(delegator).from("Message").orderBy("messageId DESC").queryList();
        println("Get Messages: " + messages.size());

    	render messages
    }
}
