// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package autostopping

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source for AWS Autostopping proxy
func LookupAwsAlb(ctx *pulumi.Context, args *LookupAwsAlbArgs, opts ...pulumi.InvokeOption) (*LookupAwsAlbResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupAwsAlbResult
	err := ctx.Invoke("harness:autostopping/getAwsAlb:getAwsAlb", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAwsAlb.
type LookupAwsAlbArgs struct {
	// Arn of AWS ALB to be imported. Required only for importing existing ALB
	AlbArn        *string `pulumi:"albArn"`
	CertificateId *string `pulumi:"certificateId"`
	// Id of the cloud connector
	CloudConnectorId              string `pulumi:"cloudConnectorId"`
	DeleteCloudResourcesOnDestroy bool   `pulumi:"deleteCloudResourcesOnDestroy"`
	// Hostname for the proxy
	HostName string `pulumi:"hostName"`
	// Name of the proxy
	Name string `pulumi:"name"`
	// Region in which cloud resources are hosted
	Region string `pulumi:"region"`
	// Route 53 hosted zone id
	Route53HostedZoneId *string `pulumi:"route53HostedZoneId"`
	// Security Group to define the security rules that determine the inbound and outbound traffic
	SecurityGroups []string `pulumi:"securityGroups"`
	// VPC in which cloud resources are hosted
	Vpc string `pulumi:"vpc"`
}

// A collection of values returned by getAwsAlb.
type LookupAwsAlbResult struct {
	// Arn of AWS ALB to be imported. Required only for importing existing ALB
	AlbArn        *string `pulumi:"albArn"`
	CertificateId *string `pulumi:"certificateId"`
	// Id of the cloud connector
	CloudConnectorId              string `pulumi:"cloudConnectorId"`
	DeleteCloudResourcesOnDestroy bool   `pulumi:"deleteCloudResourcesOnDestroy"`
	// Hostname for the proxy
	HostName string `pulumi:"hostName"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Unique identifier of the resource
	Identifier string `pulumi:"identifier"`
	// Name of the proxy
	Name string `pulumi:"name"`
	// Region in which cloud resources are hosted
	Region string `pulumi:"region"`
	// Route 53 hosted zone id
	Route53HostedZoneId *string `pulumi:"route53HostedZoneId"`
	// Security Group to define the security rules that determine the inbound and outbound traffic
	SecurityGroups []string `pulumi:"securityGroups"`
	// VPC in which cloud resources are hosted
	Vpc string `pulumi:"vpc"`
}

func LookupAwsAlbOutput(ctx *pulumi.Context, args LookupAwsAlbOutputArgs, opts ...pulumi.InvokeOption) LookupAwsAlbResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupAwsAlbResult, error) {
			args := v.(LookupAwsAlbArgs)
			r, err := LookupAwsAlb(ctx, &args, opts...)
			var s LookupAwsAlbResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupAwsAlbResultOutput)
}

// A collection of arguments for invoking getAwsAlb.
type LookupAwsAlbOutputArgs struct {
	// Arn of AWS ALB to be imported. Required only for importing existing ALB
	AlbArn        pulumi.StringPtrInput `pulumi:"albArn"`
	CertificateId pulumi.StringPtrInput `pulumi:"certificateId"`
	// Id of the cloud connector
	CloudConnectorId              pulumi.StringInput `pulumi:"cloudConnectorId"`
	DeleteCloudResourcesOnDestroy pulumi.BoolInput   `pulumi:"deleteCloudResourcesOnDestroy"`
	// Hostname for the proxy
	HostName pulumi.StringInput `pulumi:"hostName"`
	// Name of the proxy
	Name pulumi.StringInput `pulumi:"name"`
	// Region in which cloud resources are hosted
	Region pulumi.StringInput `pulumi:"region"`
	// Route 53 hosted zone id
	Route53HostedZoneId pulumi.StringPtrInput `pulumi:"route53HostedZoneId"`
	// Security Group to define the security rules that determine the inbound and outbound traffic
	SecurityGroups pulumi.StringArrayInput `pulumi:"securityGroups"`
	// VPC in which cloud resources are hosted
	Vpc pulumi.StringInput `pulumi:"vpc"`
}

func (LookupAwsAlbOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAwsAlbArgs)(nil)).Elem()
}

// A collection of values returned by getAwsAlb.
type LookupAwsAlbResultOutput struct{ *pulumi.OutputState }

func (LookupAwsAlbResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAwsAlbResult)(nil)).Elem()
}

func (o LookupAwsAlbResultOutput) ToLookupAwsAlbResultOutput() LookupAwsAlbResultOutput {
	return o
}

func (o LookupAwsAlbResultOutput) ToLookupAwsAlbResultOutputWithContext(ctx context.Context) LookupAwsAlbResultOutput {
	return o
}

// Arn of AWS ALB to be imported. Required only for importing existing ALB
func (o LookupAwsAlbResultOutput) AlbArn() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupAwsAlbResult) *string { return v.AlbArn }).(pulumi.StringPtrOutput)
}

func (o LookupAwsAlbResultOutput) CertificateId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupAwsAlbResult) *string { return v.CertificateId }).(pulumi.StringPtrOutput)
}

// Id of the cloud connector
func (o LookupAwsAlbResultOutput) CloudConnectorId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAwsAlbResult) string { return v.CloudConnectorId }).(pulumi.StringOutput)
}

func (o LookupAwsAlbResultOutput) DeleteCloudResourcesOnDestroy() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupAwsAlbResult) bool { return v.DeleteCloudResourcesOnDestroy }).(pulumi.BoolOutput)
}

// Hostname for the proxy
func (o LookupAwsAlbResultOutput) HostName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAwsAlbResult) string { return v.HostName }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupAwsAlbResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAwsAlbResult) string { return v.Id }).(pulumi.StringOutput)
}

// Unique identifier of the resource
func (o LookupAwsAlbResultOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAwsAlbResult) string { return v.Identifier }).(pulumi.StringOutput)
}

// Name of the proxy
func (o LookupAwsAlbResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAwsAlbResult) string { return v.Name }).(pulumi.StringOutput)
}

// Region in which cloud resources are hosted
func (o LookupAwsAlbResultOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAwsAlbResult) string { return v.Region }).(pulumi.StringOutput)
}

// Route 53 hosted zone id
func (o LookupAwsAlbResultOutput) Route53HostedZoneId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupAwsAlbResult) *string { return v.Route53HostedZoneId }).(pulumi.StringPtrOutput)
}

// Security Group to define the security rules that determine the inbound and outbound traffic
func (o LookupAwsAlbResultOutput) SecurityGroups() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupAwsAlbResult) []string { return v.SecurityGroups }).(pulumi.StringArrayOutput)
}

// VPC in which cloud resources are hosted
func (o LookupAwsAlbResultOutput) Vpc() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAwsAlbResult) string { return v.Vpc }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupAwsAlbResultOutput{})
}