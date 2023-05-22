// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Harness.Platform.Inputs
{

    public sealed class RoleAssignmentsPrincipalGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Identifier.
        /// </summary>
        [Input("identifier")]
        public Input<string>? Identifier { get; set; }

        /// <summary>
        /// Scope level.
        /// </summary>
        [Input("scopeLevel")]
        public Input<string>? ScopeLevel { get; set; }

        /// <summary>
        /// Type.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public RoleAssignmentsPrincipalGetArgs()
        {
        }
        public static new RoleAssignmentsPrincipalGetArgs Empty => new RoleAssignmentsPrincipalGetArgs();
    }
}
