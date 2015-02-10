package com.zhangkai.wechat.util;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 * java对象和其他数据格式之间的转换 这一技术是被JVM明确说明了的，因此不存在任何二义性。在这段代码中，
 * 因为SingletonClass没有static的属性
 * ，因此并不会被初始化。直到调用getInstance()的时候，会首先加载SingletonClassInstance类，
 * 这个类有一个static的SingletonClass实例
 * ，因此需要调用SingletonClass的构造方法，然后getInstance()将把这个内部类的instance返回给使用者
 * 。由于这个instance是static的， 因此并不会构造多次。
 * 
 * 由于SingletonClassInstance是私有静态内部类，所以不会被其他类知道，同样，static语义也要求不会有多个实例存在。并且，
 * JSL规范定义， 类的构造必须是原子性的，非并发的，因此不需要加同步块。同样，由于这个构造是并发的，所以getInstance()也并不需要加同步。
 * 
 * 并且Effiective Java也推荐的这种方式。
 * 
 * @author zhangkai
 * 
 */
public class ObjectFormat {

	private static class ObjectFormatInstance {
		private static final ObjectFormat instance = new ObjectFormat();
	}

	public static ObjectFormat newInstance() {
		return ObjectFormatInstance.instance;
	}

	private ObjectFormat() {
	}

	/**
	 * 将指定的对象转换成xml格式
	 * 
	 * @param obj
	 *            要转换的对象
	 * @return xml格式的字符串
	 * @throws JAXBException
	 */
	public String object2xml(Object obj, String encoding) throws JAXBException {

		JAXBContext context = JAXBContext.newInstance(obj.getClass());

		Marshaller marshaller = context.createMarshaller();

		marshaller.setProperty(Marshaller.JAXB_ENCODING, encoding);
		marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		StringWriter write = new StringWriter();

		marshaller.marshal(obj, write);

		return write.toString();
	}

}
