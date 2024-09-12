// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.governance;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.governance.inputs.GetRuleEnforcementArgs;
import com.pulumi.harness.governance.inputs.GetRuleEnforcementPlainArgs;
import com.pulumi.harness.governance.outputs.GetRuleEnforcementResult;
import java.util.concurrent.CompletableFuture;

public final class GovernanceFunctions {
    /**
     * Datasource for looking up a rule enforcement.
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
     * import com.pulumi.harness.governance.GovernanceFunctions;
     * import com.pulumi.harness.governance.inputs.GetRuleEnforcementArgs;
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
     *         final var example = GovernanceFunctions.getRuleEnforcement(GetRuleEnforcementArgs.builder()
     *             .enforcementId("enforcement_id")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetRuleEnforcementResult> getRuleEnforcement(GetRuleEnforcementArgs args) {
        return getRuleEnforcement(args, InvokeOptions.Empty);
    }
    /**
     * Datasource for looking up a rule enforcement.
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
     * import com.pulumi.harness.governance.GovernanceFunctions;
     * import com.pulumi.harness.governance.inputs.GetRuleEnforcementArgs;
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
     *         final var example = GovernanceFunctions.getRuleEnforcement(GetRuleEnforcementArgs.builder()
     *             .enforcementId("enforcement_id")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetRuleEnforcementResult> getRuleEnforcementPlain(GetRuleEnforcementPlainArgs args) {
        return getRuleEnforcementPlain(args, InvokeOptions.Empty);
    }
    /**
     * Datasource for looking up a rule enforcement.
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
     * import com.pulumi.harness.governance.GovernanceFunctions;
     * import com.pulumi.harness.governance.inputs.GetRuleEnforcementArgs;
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
     *         final var example = GovernanceFunctions.getRuleEnforcement(GetRuleEnforcementArgs.builder()
     *             .enforcementId("enforcement_id")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetRuleEnforcementResult> getRuleEnforcement(GetRuleEnforcementArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("harness:governance/getRuleEnforcement:getRuleEnforcement", TypeShape.of(GetRuleEnforcementResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Datasource for looking up a rule enforcement.
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
     * import com.pulumi.harness.governance.GovernanceFunctions;
     * import com.pulumi.harness.governance.inputs.GetRuleEnforcementArgs;
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
     *         final var example = GovernanceFunctions.getRuleEnforcement(GetRuleEnforcementArgs.builder()
     *             .enforcementId("enforcement_id")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetRuleEnforcementResult> getRuleEnforcementPlain(GetRuleEnforcementPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("harness:governance/getRuleEnforcement:getRuleEnforcement", TypeShape.of(GetRuleEnforcementResult.class), args, Utilities.withVersion(options));
    }
}
