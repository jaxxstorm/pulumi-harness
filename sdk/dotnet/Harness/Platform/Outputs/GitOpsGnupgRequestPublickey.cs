// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Harness.Platform.Outputs
{

    [OutputType]
    public sealed class GitOpsGnupgRequestPublickey
    {
        public readonly string? Fingerprint;
        public readonly string KeyData;
        public readonly string? KeyId;
        public readonly string? Owner;
        public readonly string? SubType;
        public readonly string? Trust;

        [OutputConstructor]
        private GitOpsGnupgRequestPublickey(
            string? fingerprint,

            string keyData,

            string? keyId,

            string? owner,

            string? subType,

            string? trust)
        {
            Fingerprint = fingerprint;
            KeyData = keyData;
            KeyId = keyId;
            Owner = owner;
            SubType = subType;
            Trust = trust;
        }
    }
}
