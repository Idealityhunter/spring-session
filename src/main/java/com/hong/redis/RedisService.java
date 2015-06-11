package com.hong.redis;

/**
 * Created by Cai on 2015/6/11 16:11.
 */
public interface RedisService {
    /**
     * ͨ��keyɾ��
     *
     * @param keys
     */
    long del(String... keys);

    /**
     * ���key value �������ô��ʱ��(byte)
     *
     * @param key
     * @param value
     * @param liveTime
     */
    void set(byte[] key, byte[] value, long liveTime);

    /**
     * ���key value �������ô��ʱ��
     *
     * @param key
     * @param value
     * @param liveTime ��λ��
     */
    void set(String key, String value, long liveTime);

    /**
     * ���key value
     *
     * @param key
     * @param value
     */
    void set(String key, String value);

    /**
     * ���key value (�ֽ�)(���л�)
     *
     * @param key
     * @param value
     */
    void set(byte[] key, byte[] value);

    /**
     * ��ȡredis value (String)
     *
     * @param key
     * @return
     */
    String get(String key);

    /**
     * ͨ������ƥ��keys
     *
     * @param pattern
     * @return
     */
    void setKeys(String pattern);

    /**
     * ���key�Ƿ��Ѿ�����
     *
     * @param key
     * @return
     */
    boolean exists(String key);

    /**
     * ���redis ��������
     *
     * @return
     */
    String flushDB();

    /**
     * �鿴redis���ж�������
     */
    long dbSize();

    /**
     * ����Ƿ����ӳɹ�
     *
     * @return
     */
    String ping();
}
