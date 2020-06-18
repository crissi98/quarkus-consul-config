package io.quarkus.consul.config.runtime;
public final class ConsulConfig$AgentConfig$$accessor {
    private ConsulConfig$AgentConfig$$accessor() {}
    @SuppressWarnings("unchecked")
    public static Object get_hostPort(Object __instance) {
        return ((io.quarkus.consul.config.runtime.ConsulConfig.AgentConfig)__instance).hostPort;
    }
    @SuppressWarnings("unchecked")
    public static void set_hostPort(Object __instance, Object hostPort) {
        ((io.quarkus.consul.config.runtime.ConsulConfig.AgentConfig)__instance).hostPort = (java.net.InetSocketAddress)hostPort;
    }
    @SuppressWarnings("unchecked")
    public static boolean get_useHttps(Object __instance) {
        return ((io.quarkus.consul.config.runtime.ConsulConfig.AgentConfig)__instance).useHttps;
    }
    @SuppressWarnings("unchecked")
    public static void set_useHttps(Object __instance, boolean useHttps) {
        ((io.quarkus.consul.config.runtime.ConsulConfig.AgentConfig)__instance).useHttps = useHttps;
    }
    @SuppressWarnings("unchecked")
    public static Object get_token(Object __instance) {
        return ((io.quarkus.consul.config.runtime.ConsulConfig.AgentConfig)__instance).token;
    }
    @SuppressWarnings("unchecked")
    public static void set_token(Object __instance, Object token) {
        ((io.quarkus.consul.config.runtime.ConsulConfig.AgentConfig)__instance).token = (java.util.Optional<String>)token;
    }
    @SuppressWarnings("unchecked")
    public static Object get_keyStore(Object __instance) {
        return ((io.quarkus.consul.config.runtime.ConsulConfig.AgentConfig)__instance).keyStore;
    }
    @SuppressWarnings("unchecked")
    public static void set_keyStore(Object __instance, Object keyStore) {
        ((io.quarkus.consul.config.runtime.ConsulConfig.AgentConfig)__instance).keyStore = (java.util.Optional<java.nio.file.Path>)keyStore;
    }
    @SuppressWarnings("unchecked")
    public static Object get_keyStorePassword(Object __instance) {
        return ((io.quarkus.consul.config.runtime.ConsulConfig.AgentConfig)__instance).keyStorePassword;
    }
    @SuppressWarnings("unchecked")
    public static void set_keyStorePassword(Object __instance, Object keyStorePassword) {
        ((io.quarkus.consul.config.runtime.ConsulConfig.AgentConfig)__instance).keyStorePassword = (java.util.Optional<String>)keyStorePassword;
    }
    @SuppressWarnings("unchecked")
    public static Object get_trustStore(Object __instance) {
        return ((io.quarkus.consul.config.runtime.ConsulConfig.AgentConfig)__instance).trustStore;
    }
    @SuppressWarnings("unchecked")
    public static void set_trustStore(Object __instance, Object trustStore) {
        ((io.quarkus.consul.config.runtime.ConsulConfig.AgentConfig)__instance).trustStore = (java.util.Optional<java.nio.file.Path>)trustStore;
    }
    @SuppressWarnings("unchecked")
    public static Object get_trustStorePassword(Object __instance) {
        return ((io.quarkus.consul.config.runtime.ConsulConfig.AgentConfig)__instance).trustStorePassword;
    }
    @SuppressWarnings("unchecked")
    public static void set_trustStorePassword(Object __instance, Object trustStorePassword) {
        ((io.quarkus.consul.config.runtime.ConsulConfig.AgentConfig)__instance).trustStorePassword = (java.util.Optional<String>)trustStorePassword;
    }
    @SuppressWarnings("unchecked")
    public static boolean get_trustCerts(Object __instance) {
        return ((io.quarkus.consul.config.runtime.ConsulConfig.AgentConfig)__instance).trustCerts;
    }
    @SuppressWarnings("unchecked")
    public static void set_trustCerts(Object __instance, boolean trustCerts) {
        ((io.quarkus.consul.config.runtime.ConsulConfig.AgentConfig)__instance).trustCerts = trustCerts;
    }
    @SuppressWarnings("unchecked")
    public static Object get_connectionTimeout(Object __instance) {
        return ((io.quarkus.consul.config.runtime.ConsulConfig.AgentConfig)__instance).connectionTimeout;
    }
    @SuppressWarnings("unchecked")
    public static void set_connectionTimeout(Object __instance, Object connectionTimeout) {
        ((io.quarkus.consul.config.runtime.ConsulConfig.AgentConfig)__instance).connectionTimeout = (java.time.Duration)connectionTimeout;
    }
    @SuppressWarnings("unchecked")
    public static Object get_readTimeout(Object __instance) {
        return ((io.quarkus.consul.config.runtime.ConsulConfig.AgentConfig)__instance).readTimeout;
    }
    @SuppressWarnings("unchecked")
    public static void set_readTimeout(Object __instance, Object readTimeout) {
        ((io.quarkus.consul.config.runtime.ConsulConfig.AgentConfig)__instance).readTimeout = (java.time.Duration)readTimeout;
    }
    public static Object construct() {
        return new io.quarkus.consul.config.runtime.ConsulConfig.AgentConfig();
    }
}
