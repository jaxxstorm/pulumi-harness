// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.platform.NotificationRuleArgs;
import com.pulumi.harness.platform.inputs.NotificationRuleState;
import com.pulumi.harness.platform.outputs.NotificationRuleRequest;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for creating a Notification Rule.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.harness.platform.NotificationRule;
 * import com.pulumi.harness.platform.NotificationRuleArgs;
 * import com.pulumi.harness.platform.inputs.NotificationRuleRequestArgs;
 * import com.pulumi.harness.platform.inputs.NotificationRuleRequestNotificationMethodArgs;
 * import static com.pulumi.codegen.internal.Serialization.*;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         // Sample resource for SLO
 *         var example = new NotificationRule("example", NotificationRuleArgs.builder()
 *             .orgId("org_id")
 *             .projectId("project_id")
 *             .identifier("identifier")
 *             .request(NotificationRuleRequestArgs.builder()
 *                 .name("name")
 *                 .notificationMethod(NotificationRuleRequestNotificationMethodArgs.builder()
 *                     .type("Slack")
 *                     .spec(serializeJson(
 *                         jsonObject(
 *                             jsonProperty("webhook_url", "http://myslackwebhookurl.com"),
 *                             jsonProperty("user_groups", jsonArray("account.test"))
 *                         )))
 *                     .build())
 *                 .type("ServiceLevelObjective")
 *                 .conditions(                
 *                     NotificationRuleRequestConditionArgs.builder()
 *                         .type("ErrorBudgetBurnRate")
 *                         .spec(serializeJson(
 *                             jsonObject(
 *                                 jsonProperty("threshold", 1)
 *                             )))
 *                         .build(),
 *                     NotificationRuleRequestConditionArgs.builder()
 *                         .type("ErrorBudgetRemainingPercentage")
 *                         .spec(serializeJson(
 *                             jsonObject(
 *                                 jsonProperty("threshold", 30)
 *                             )))
 *                         .build(),
 *                     NotificationRuleRequestConditionArgs.builder()
 *                         .type("ErrorBudgetRemainingMinutes")
 *                         .spec(serializeJson(
 *                             jsonObject(
 *                                 jsonProperty("threshold", 300)
 *                             )))
 *                         .build())
 *                 .build())
 *             .build());
 * 
 *         // Sample resource for Monitored Service
 *         var example1 = new NotificationRule("example1", NotificationRuleArgs.builder()
 *             .orgId("org_id")
 *             .projectId("project_id")
 *             .identifier("identifier")
 *             .request(NotificationRuleRequestArgs.builder()
 *                 .name("name")
 *                 .notificationMethod(NotificationRuleRequestNotificationMethodArgs.builder()
 *                     .type("Slack")
 *                     .spec(serializeJson(
 *                         jsonObject(
 *                             jsonProperty("webhook_url", "http://myslackwebhookurl.com"),
 *                             jsonProperty("user_groups", jsonArray("account.test"))
 *                         )))
 *                     .build())
 *                 .type("MonitoredService")
 *                 .conditions(                
 *                     NotificationRuleRequestConditionArgs.builder()
 *                         .type("ChangeImpact")
 *                         .spec(serializeJson(
 *                             jsonObject(
 *                                 jsonProperty("threshold", 33),
 *                                 jsonProperty("period", "30m"),
 *                                 jsonProperty("changeCategories", jsonArray(
 *                                     "Deployment", 
 *                                     "Infrastructure"
 *                                 ))
 *                             )))
 *                         .build(),
 *                     NotificationRuleRequestConditionArgs.builder()
 *                         .type("HealthScore")
 *                         .spec(serializeJson(
 *                             jsonObject(
 *                                 jsonProperty("threshold", 33),
 *                                 jsonProperty("period", "30m")
 *                             )))
 *                         .build(),
 *                     NotificationRuleRequestConditionArgs.builder()
 *                         .type("ChangeObserved")
 *                         .spec(serializeJson(
 *                             jsonObject(
 *                                 jsonProperty("changeCategories", jsonArray(
 *                                     "Deployment", 
 *                                     "Alert", 
 *                                     "ChaosExperiment"
 *                                 ))
 *                             )))
 *                         .build(),
 *                     NotificationRuleRequestConditionArgs.builder()
 *                         .type("DeploymentImpactReport")
 *                         .spec(serializeJson(
 *                             jsonObject(
 * 
 *                             )))
 *                         .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Import account level Notification Rule
 * 
 * ```sh
 * $ pulumi import harness:platform/notificationRule:NotificationRule example &lt;notification_rule_id&gt;
 * ```
 * 
 * Import organization level Notification Rule
 * 
 * ```sh
 * $ pulumi import harness:platform/notificationRule:NotificationRule example &lt;org_id&gt;/&lt;notification_rule_id&gt;
 * ```
 * 
 * Import project level Notification Rule
 * 
 * ```sh
 * $ pulumi import harness:platform/notificationRule:NotificationRule example &lt;org_id&gt;/&lt;project_id&gt;/&lt;notification_rule_id&gt;
 * ```
 * 
 */
@ResourceType(type="harness:platform/notificationRule:NotificationRule")
public class NotificationRule extends com.pulumi.resources.CustomResource {
    /**
     * Identifier of the Notification Rule.
     * 
     */
    @Export(name="identifier", refs={String.class}, tree="[0]")
    private Output<String> identifier;

    /**
     * @return Identifier of the Notification Rule.
     * 
     */
    public Output<String> identifier() {
        return this.identifier;
    }
    /**
     * Identifier of the organization in which the Notification Rule is configured.
     * 
     */
    @Export(name="orgId", refs={String.class}, tree="[0]")
    private Output<String> orgId;

    /**
     * @return Identifier of the organization in which the Notification Rule is configured.
     * 
     */
    public Output<String> orgId() {
        return this.orgId;
    }
    /**
     * Identifier of the project in which the Notification Rule is configured.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output<String> projectId;

    /**
     * @return Identifier of the project in which the Notification Rule is configured.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * Request for creating or updating Notification Rule.
     * 
     */
    @Export(name="request", refs={NotificationRuleRequest.class}, tree="[0]")
    private Output</* @Nullable */ NotificationRuleRequest> request;

    /**
     * @return Request for creating or updating Notification Rule.
     * 
     */
    public Output<Optional<NotificationRuleRequest>> request() {
        return Codegen.optional(this.request);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NotificationRule(java.lang.String name) {
        this(name, NotificationRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NotificationRule(java.lang.String name, NotificationRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NotificationRule(java.lang.String name, NotificationRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/notificationRule:NotificationRule", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private NotificationRule(java.lang.String name, Output<java.lang.String> id, @Nullable NotificationRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/notificationRule:NotificationRule", name, state, makeResourceOptions(options, id), false);
    }

    private static NotificationRuleArgs makeArgs(NotificationRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? NotificationRuleArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .pluginDownloadURL("github://api.github.com/pulumi")
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static NotificationRule get(java.lang.String name, Output<java.lang.String> id, @Nullable NotificationRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NotificationRule(name, id, state, options);
    }
}
