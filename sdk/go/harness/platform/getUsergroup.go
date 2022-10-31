// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source for retrieving a Harness User Group.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/lbrlabs/pulumi-harness/sdk/go/harness/platform"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err = platform.LookupUsergroup(ctx, &platform.LookupUsergroupArgs{
//				Identifier: pulumi.StringRef("identifier"),
//				OrgId:      pulumi.StringRef("org_id"),
//				ProjectId:  pulumi.StringRef("project_id"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = platform.LookupUsergroup(ctx, &platform.LookupUsergroupArgs{
//				Name:      pulumi.StringRef("name"),
//				OrgId:     pulumi.StringRef("org_id"),
//				ProjectId: pulumi.StringRef("project_id"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupUsergroup(ctx *pulumi.Context, args *LookupUsergroupArgs, opts ...pulumi.InvokeOption) (*LookupUsergroupResult, error) {
	opts = pkgInvokeDefaultOpts(opts)
	var rv LookupUsergroupResult
	err := ctx.Invoke("harness:platform/getUsergroup:getUsergroup", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getUsergroup.
type LookupUsergroupArgs struct {
	// Unique identifier of the resource.
	Identifier *string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// List of notification settings.
	NotificationConfigs []GetUsergroupNotificationConfig `pulumi:"notificationConfigs"`
	// Unique identifier of the Organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the Project.
	ProjectId *string `pulumi:"projectId"`
}

// A collection of values returned by getUsergroup.
type LookupUsergroupResult struct {
	// Description of the resource.
	Description string `pulumi:"description"`
	// Whether the user group is externally managed.
	ExternallyManaged bool `pulumi:"externallyManaged"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Unique identifier of the resource.
	Identifier *string `pulumi:"identifier"`
	// Name of the linked SSO.
	LinkedSsoDisplayName string `pulumi:"linkedSsoDisplayName"`
	// The SSO account ID that the user group is linked to.
	LinkedSsoId string `pulumi:"linkedSsoId"`
	// Type of linked SSO
	LinkedSsoType string `pulumi:"linkedSsoType"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// List of notification settings.
	NotificationConfigs []GetUsergroupNotificationConfig `pulumi:"notificationConfigs"`
	// Unique identifier of the Organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the Project.
	ProjectId *string `pulumi:"projectId"`
	// Identifier of the userGroup in SSO.
	SsoGroupId string `pulumi:"ssoGroupId"`
	// Name of the SSO userGroup.
	SsoGroupName string `pulumi:"ssoGroupName"`
	// Whether sso is linked or not
	SsoLinked bool `pulumi:"ssoLinked"`
	// Tags to associate with the resource. Tags should be in the form `name:value`.
	Tags []string `pulumi:"tags"`
	// List of users in the UserGroup.
	Users []string `pulumi:"users"`
}

func LookupUsergroupOutput(ctx *pulumi.Context, args LookupUsergroupOutputArgs, opts ...pulumi.InvokeOption) LookupUsergroupResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupUsergroupResult, error) {
			args := v.(LookupUsergroupArgs)
			r, err := LookupUsergroup(ctx, &args, opts...)
			var s LookupUsergroupResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupUsergroupResultOutput)
}

// A collection of arguments for invoking getUsergroup.
type LookupUsergroupOutputArgs struct {
	// Unique identifier of the resource.
	Identifier pulumi.StringPtrInput `pulumi:"identifier"`
	// Name of the resource.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// List of notification settings.
	NotificationConfigs GetUsergroupNotificationConfigArrayInput `pulumi:"notificationConfigs"`
	// Unique identifier of the Organization.
	OrgId pulumi.StringPtrInput `pulumi:"orgId"`
	// Unique identifier of the Project.
	ProjectId pulumi.StringPtrInput `pulumi:"projectId"`
}

func (LookupUsergroupOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupUsergroupArgs)(nil)).Elem()
}

// A collection of values returned by getUsergroup.
type LookupUsergroupResultOutput struct{ *pulumi.OutputState }

func (LookupUsergroupResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupUsergroupResult)(nil)).Elem()
}

func (o LookupUsergroupResultOutput) ToLookupUsergroupResultOutput() LookupUsergroupResultOutput {
	return o
}

func (o LookupUsergroupResultOutput) ToLookupUsergroupResultOutputWithContext(ctx context.Context) LookupUsergroupResultOutput {
	return o
}

// Description of the resource.
func (o LookupUsergroupResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUsergroupResult) string { return v.Description }).(pulumi.StringOutput)
}

// Whether the user group is externally managed.
func (o LookupUsergroupResultOutput) ExternallyManaged() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupUsergroupResult) bool { return v.ExternallyManaged }).(pulumi.BoolOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupUsergroupResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUsergroupResult) string { return v.Id }).(pulumi.StringOutput)
}

// Unique identifier of the resource.
func (o LookupUsergroupResultOutput) Identifier() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupUsergroupResult) *string { return v.Identifier }).(pulumi.StringPtrOutput)
}

// Name of the linked SSO.
func (o LookupUsergroupResultOutput) LinkedSsoDisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUsergroupResult) string { return v.LinkedSsoDisplayName }).(pulumi.StringOutput)
}

// The SSO account ID that the user group is linked to.
func (o LookupUsergroupResultOutput) LinkedSsoId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUsergroupResult) string { return v.LinkedSsoId }).(pulumi.StringOutput)
}

// Type of linked SSO
func (o LookupUsergroupResultOutput) LinkedSsoType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUsergroupResult) string { return v.LinkedSsoType }).(pulumi.StringOutput)
}

// Name of the resource.
func (o LookupUsergroupResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupUsergroupResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// List of notification settings.
func (o LookupUsergroupResultOutput) NotificationConfigs() GetUsergroupNotificationConfigArrayOutput {
	return o.ApplyT(func(v LookupUsergroupResult) []GetUsergroupNotificationConfig { return v.NotificationConfigs }).(GetUsergroupNotificationConfigArrayOutput)
}

// Unique identifier of the Organization.
func (o LookupUsergroupResultOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupUsergroupResult) *string { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Unique identifier of the Project.
func (o LookupUsergroupResultOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupUsergroupResult) *string { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Identifier of the userGroup in SSO.
func (o LookupUsergroupResultOutput) SsoGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUsergroupResult) string { return v.SsoGroupId }).(pulumi.StringOutput)
}

// Name of the SSO userGroup.
func (o LookupUsergroupResultOutput) SsoGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUsergroupResult) string { return v.SsoGroupName }).(pulumi.StringOutput)
}

// Whether sso is linked or not
func (o LookupUsergroupResultOutput) SsoLinked() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupUsergroupResult) bool { return v.SsoLinked }).(pulumi.BoolOutput)
}

// Tags to associate with the resource. Tags should be in the form `name:value`.
func (o LookupUsergroupResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupUsergroupResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

// List of users in the UserGroup.
func (o LookupUsergroupResultOutput) Users() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupUsergroupResult) []string { return v.Users }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupUsergroupResultOutput{})
}
