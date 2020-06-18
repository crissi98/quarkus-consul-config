package io.quarkus.consul.config.runtime;
public final class ConsulConfig$$accessor {
    private ConsulConfig$$accessor() {}
    @SuppressWarnings("unchecked")
    public static boolean get_enabled(Object __instance) {
        return ((ConsulConfig)__instance).enabled;
    }
    @SuppressWarnings("unchecked")
    public static void set_enabled(Object __instance, boolean enabled) {
        ((ConsulConfig)__instance).enabled = enabled;
    }
    @SuppressWarnings("unchecked")
    public static Object get_agent(Object __instance) {
        return ((ConsulConfig)__instance).agent;
    }
    @SuppressWarnings("unchecked")
    public static void set_agent(Object __instance, Object agent) {
        ((ConsulConfig)__instance).agent = (io.quarkus.consul.config.runtime.ConsulConfig.AgentConfig)agent;
    }
    @SuppressWarnings("unchecked")
    public static Object get_prefix(Object __instance) {
        return ((ConsulConfig)__instance).prefix;
    }
    @SuppressWarnings("unchecked")
    public static void set_prefix(Object __instance, Object prefix) {
        ((ConsulConfig)__instance).prefix = (java.util.Optional<String>)prefix;
    }
    @SuppressWarnings("unchecked")
    public static Object get_rawValueKeys(Object __instance) {
        return ((ConsulConfig)__instance).rawValueKeys;
    }
    @SuppressWarnings("unchecked")
    public static void set_rawValueKeys(Object __instance, Object rawValueKeys) {
        ((ConsulConfig)__instance).rawValueKeys = (java.util.Optional<java.util.List<String>>)rawValueKeys;
    }
    @SuppressWarnings("unchecked")
    public static Object get_propertiesValueKeys(Object __instance) {
        return ((ConsulConfig)__instance).propertiesValueKeys;
    }
    @SuppressWarnings("unchecked")
    public static void set_propertiesValueKeys(Object __instance, Object propertiesValueKeys) {
        ((ConsulConfig)__instance).propertiesValueKeys = (java.util.Optional<java.util.List<String>>)propertiesValueKeys;
    }
    @SuppressWarnings("unchecked")
    public static boolean get_failOnMissingKey(Object __instance) {
        return ((ConsulConfig)__instance).failOnMissingKey;
    }
    @SuppressWarnings("unchecked")
    public static void set_failOnMissingKey(Object __instance, boolean failOnMissingKey) {
        ((ConsulConfig)__instance).failOnMissingKey = failOnMissingKey;
    }
    public static Object construct() {
        return new ConsulConfig();
    }
}
