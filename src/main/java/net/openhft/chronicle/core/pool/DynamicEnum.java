package net.openhft.chronicle.core.pool;

/*
 * Created by peter.lawrey@chronicle.software on 28/07/2017
 */
public interface DynamicEnum<E extends Enum<E> & DynamicEnum<E>> {
}
