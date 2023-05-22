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

    public sealed class GitopsGnupgRequestGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("publickeys")]
        private InputList<Inputs.GitopsGnupgRequestPublickeyGetArgs>? _publickeys;

        /// <summary>
        /// Public key details.
        /// </summary>
        public InputList<Inputs.GitopsGnupgRequestPublickeyGetArgs> Publickeys
        {
            get => _publickeys ?? (_publickeys = new InputList<Inputs.GitopsGnupgRequestPublickeyGetArgs>());
            set => _publickeys = value;
        }

        /// <summary>
        /// Indicates if the GnuPG Key should be inserted if not present or updated if present.
        /// </summary>
        [Input("upsert", required: true)]
        public Input<bool> Upsert { get; set; } = null!;

        public GitopsGnupgRequestGetArgs()
        {
        }
        public static new GitopsGnupgRequestGetArgs Empty => new GitopsGnupgRequestGetArgs();
    }
}
