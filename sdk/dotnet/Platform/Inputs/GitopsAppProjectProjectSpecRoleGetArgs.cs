// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class GitopsAppProjectProjectSpecRoleGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description of the role.
        /// </summary>
        [Input("description", required: true)]
        public Input<string> Description { get; set; } = null!;

        [Input("groups")]
        private InputList<string>? _groups;

        /// <summary>
        /// Groups associated with the role.
        /// </summary>
        public InputList<string> Groups
        {
            get => _groups ?? (_groups = new InputList<string>());
            set => _groups = value;
        }

        [Input("jwtTokens")]
        private InputList<Inputs.GitopsAppProjectProjectSpecRoleJwtTokenGetArgs>? _jwtTokens;

        /// <summary>
        /// JWT tokens associated with the role.
        /// </summary>
        public InputList<Inputs.GitopsAppProjectProjectSpecRoleJwtTokenGetArgs> JwtTokens
        {
            get => _jwtTokens ?? (_jwtTokens = new InputList<Inputs.GitopsAppProjectProjectSpecRoleJwtTokenGetArgs>());
            set => _jwtTokens = value;
        }

        /// <summary>
        /// Name of the role.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("policies")]
        private InputList<string>? _policies;

        /// <summary>
        /// Policies associated with the role. These are argo RBAC policies and may not necessarily reflect in harness.
        /// </summary>
        public InputList<string> Policies
        {
            get => _policies ?? (_policies = new InputList<string>());
            set => _policies = value;
        }

        public GitopsAppProjectProjectSpecRoleGetArgs()
        {
        }
        public static new GitopsAppProjectProjectSpecRoleGetArgs Empty => new GitopsAppProjectProjectSpecRoleGetArgs();
    }
}
