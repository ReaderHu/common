package com.systop.strings;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author 王浩
 *
 */
public class BeanUtil {

    public static <T extends Object> T deepCopy(T entity) throws Exception {

        ByteArrayOutputStream baos = null;
        ObjectOutputStream oos = null;

        ByteArrayInputStream bais = null;
        ObjectInputStream ois = null;

        Object o = null;
        // 如果子类没有继承该接口，这一步会报错
        try {
            baos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(baos);
            oos.writeObject(entity);
            bais = new ByteArrayInputStream(baos.toByteArray());
            ois = new ObjectInputStream(bais);

            o = ois.readObject();
            return (T) o;
        } catch (Exception e) {
            throw new Exception("对象中包含没有继承序列化的对象");
        } finally {
            try {
                baos.close();
                oos.close();
                bais.close();
                ois.close();
            } catch (Exception e2) {
                // 这里报错不需要处理
            }
        }
    }
}
