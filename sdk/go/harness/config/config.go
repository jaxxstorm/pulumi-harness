// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package config

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
)

// The Harness account id. This can also be set using the `HARNESS_ACCOUNT_ID` environment variable.
func GetAccountId(ctx *pulumi.Context) string {
	v, err := config.Try(ctx, "harness:accountId")
	if err == nil {
		return v
	}
	return getEnvOrDefault("", nil, "HARNESS_ACCOUNT_ID").(string)
}

// The Harness API key. This can also be set using the `HARNESS_API_KEY` environment variable. For more information to
// create an API key in FirstGen, see https://docs.harness.io/article/smloyragsm-api-keys#create_an_api_key.
func GetApiKey(ctx *pulumi.Context) string {
	v, err := config.Try(ctx, "harness:apiKey")
	if err == nil {
		return v
	}
	return getEnvOrDefault("", nil, "HARNESS_API_KEY").(string)
}

// The URL of the Harness API endpoint. The default is `https://app.harness.io/gateway`. This can also be set using the
// `HARNESS_ENDPOINT` environment variable.
func GetEndpoint(ctx *pulumi.Context) string {
	v, err := config.Try(ctx, "harness:endpoint")
	if err == nil {
		return v
	}
	return getEnvOrDefault("", nil, "HARNESS_ENDPOINT").(string)
}

// The API key for the Harness next gen platform. This can also be set using the `HARNESS_PLATFORM_API_KEY` environment
// variable. For more information to create an API key in NextGen, see
// https://docs.harness.io/article/tdoad7xrh9-add-and-manage-api-keys.
func GetPlatformApiKey(ctx *pulumi.Context) string {
	v, err := config.Try(ctx, "harness:platformApiKey")
	if err == nil {
		return v
	}
	return getEnvOrDefault("", nil, "HARNESS_PLATFORM_API_KEY").(string)
}
