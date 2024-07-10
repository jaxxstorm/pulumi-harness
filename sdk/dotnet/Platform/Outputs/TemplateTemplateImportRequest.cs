// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Outputs
{

    [OutputType]
    public sealed class TemplateTemplateImportRequest
    {
        /// <summary>
        /// Description of the template.
        /// </summary>
        public readonly string? TemplateDescription;
        /// <summary>
        /// Name of the template.
        /// </summary>
        public readonly string? TemplateName;
        /// <summary>
        /// Version of the template.
        /// </summary>
        public readonly string? TemplateVersion;

        [OutputConstructor]
        private TemplateTemplateImportRequest(
            string? templateDescription,

            string? templateName,

            string? templateVersion)
        {
            TemplateDescription = templateDescription;
            TemplateName = templateName;
            TemplateVersion = templateVersion;
        }
    }
}
