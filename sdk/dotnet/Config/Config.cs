// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Immutable;

namespace Lbrlabs.PulumiPackage.Harness
{
    public static class Config
    {
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Design", "IDE1006", Justification = 
        "Double underscore prefix used to avoid conflicts with variable names.")]
        private sealed class __Value<T>
        {
            private readonly Func<T> _getter;
            private T _value = default!;
            private bool _set;

            public __Value(Func<T> getter)
            {
                _getter = getter;
            }

            public T Get() => _set ? _value : _getter();

            public void Set(T value)
            {
                _value = value;
                _set = true;
            }
        }

        private static readonly global::Pulumi.Config __config = new global::Pulumi.Config("harness");

        private static readonly __Value<string?> _accountId = new __Value<string?>(() => __config.Get("accountId") ?? Utilities.GetEnv("HARNESS_ACCOUNT_ID"));
        /// <summary>
        /// The Harness account id. This can also be set using the `HARNESS_ACCOUNT_ID` environment variable.
        /// </summary>
        public static string? AccountId
        {
            get => _accountId.Get();
            set => _accountId.Set(value);
        }

        private static readonly __Value<string?> _apiKey = new __Value<string?>(() => __config.Get("apiKey") ?? Utilities.GetEnv("HARNESS_API_KEY"));
        /// <summary>
        /// The Harness API key. This can also be set using the `HARNESS_API_KEY` environment variable. For more information to
        /// create an API key in FirstGen, see https://docs.harness.io/article/smloyragsm-api-keys#create_an_api_key.
        /// </summary>
        public static string? ApiKey
        {
            get => _apiKey.Get();
            set => _apiKey.Set(value);
        }

        private static readonly __Value<string?> _endpoint = new __Value<string?>(() => __config.Get("endpoint") ?? Utilities.GetEnv("HARNESS_ENDPOINT"));
        /// <summary>
        /// The URL of the Harness API endpoint. The default is `https://app.harness.io/gateway`. This can also be set using the
        /// `HARNESS_ENDPOINT` environment variable.
        /// </summary>
        public static string? Endpoint
        {
            get => _endpoint.Get();
            set => _endpoint.Set(value);
        }

        private static readonly __Value<string?> _platformApiKey = new __Value<string?>(() => __config.Get("platformApiKey") ?? Utilities.GetEnv("HARNESS_PLATFORM_API_KEY"));
        /// <summary>
        /// The API key for the Harness next gen platform. This can also be set using the `HARNESS_PLATFORM_API_KEY` environment
        /// variable. For more information to create an API key in NextGen, see
        /// https://docs.harness.io/article/tdoad7xrh9-add-and-manage-api-keys.
        /// </summary>
        public static string? PlatformApiKey
        {
            get => _platformApiKey.Get();
            set => _platformApiKey.Set(value);
        }

    }
}
