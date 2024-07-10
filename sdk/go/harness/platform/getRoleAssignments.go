// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-harness/sdk/go/harness/platform"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := platform.LookupRoleAssignments(ctx, &platform.LookupRoleAssignmentsArgs{
//				Identifier: "identifier",
//				OrgId:      pulumi.StringRef("org_id"),
//				ProjectId:  pulumi.StringRef("project_id"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupRoleAssignments(ctx *pulumi.Context, args *LookupRoleAssignmentsArgs, opts ...pulumi.InvokeOption) (*LookupRoleAssignmentsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupRoleAssignmentsResult
	err := ctx.Invoke("harness:platform/getRoleAssignments:getRoleAssignments", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getRoleAssignments.
type LookupRoleAssignmentsArgs struct {
	// Identifier for role assignment.
	Identifier string `pulumi:"identifier"`
	// Org identifier.
	OrgId *string `pulumi:"orgId"`
	// Project Identifier
	ProjectId *string `pulumi:"projectId"`
}

// A collection of values returned by getRoleAssignments.
type LookupRoleAssignmentsResult struct {
	// The `disabled` attribute in the role assignment resource controls the status of the role assignment. Setting `disabled` to `false` activates the role and its permissions, enabling the assigned entity to perform allowed actions. Conversely, setting `disabled` to `true` deactivates the role, revoking the entity's permissions and action capabilities. Default value should be `false`.
	Disabled bool `pulumi:"disabled"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Identifier for role assignment.
	Identifier string `pulumi:"identifier"`
	// Specifies whether the role assignment is managed by Harness. Setting managed to `true` means that Harness will manage the lifecycle of the role assignment, including its creation, updates, and deletion. Conversely, setting it to `false` indicates that the role assignment is not managed by Harness, and thus Harness will not perform actions on it. Default value should be `false`.
	Managed bool `pulumi:"managed"`
	// Org identifier.
	OrgId *string `pulumi:"orgId"`
	// Principal.
	Principals []GetRoleAssignmentsPrincipal `pulumi:"principals"`
	// Project Identifier
	ProjectId *string `pulumi:"projectId"`
	// Resource group identifier.
	ResourceGroupIdentifier string `pulumi:"resourceGroupIdentifier"`
	// Role identifier.
	RoleIdentifier string `pulumi:"roleIdentifier"`
}

func LookupRoleAssignmentsOutput(ctx *pulumi.Context, args LookupRoleAssignmentsOutputArgs, opts ...pulumi.InvokeOption) LookupRoleAssignmentsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupRoleAssignmentsResult, error) {
			args := v.(LookupRoleAssignmentsArgs)
			r, err := LookupRoleAssignments(ctx, &args, opts...)
			var s LookupRoleAssignmentsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupRoleAssignmentsResultOutput)
}

// A collection of arguments for invoking getRoleAssignments.
type LookupRoleAssignmentsOutputArgs struct {
	// Identifier for role assignment.
	Identifier pulumi.StringInput `pulumi:"identifier"`
	// Org identifier.
	OrgId pulumi.StringPtrInput `pulumi:"orgId"`
	// Project Identifier
	ProjectId pulumi.StringPtrInput `pulumi:"projectId"`
}

func (LookupRoleAssignmentsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupRoleAssignmentsArgs)(nil)).Elem()
}

// A collection of values returned by getRoleAssignments.
type LookupRoleAssignmentsResultOutput struct{ *pulumi.OutputState }

func (LookupRoleAssignmentsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupRoleAssignmentsResult)(nil)).Elem()
}

func (o LookupRoleAssignmentsResultOutput) ToLookupRoleAssignmentsResultOutput() LookupRoleAssignmentsResultOutput {
	return o
}

func (o LookupRoleAssignmentsResultOutput) ToLookupRoleAssignmentsResultOutputWithContext(ctx context.Context) LookupRoleAssignmentsResultOutput {
	return o
}

// The `disabled` attribute in the role assignment resource controls the status of the role assignment. Setting `disabled` to `false` activates the role and its permissions, enabling the assigned entity to perform allowed actions. Conversely, setting `disabled` to `true` deactivates the role, revoking the entity's permissions and action capabilities. Default value should be `false`.
func (o LookupRoleAssignmentsResultOutput) Disabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupRoleAssignmentsResult) bool { return v.Disabled }).(pulumi.BoolOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupRoleAssignmentsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRoleAssignmentsResult) string { return v.Id }).(pulumi.StringOutput)
}

// Identifier for role assignment.
func (o LookupRoleAssignmentsResultOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRoleAssignmentsResult) string { return v.Identifier }).(pulumi.StringOutput)
}

// Specifies whether the role assignment is managed by Harness. Setting managed to `true` means that Harness will manage the lifecycle of the role assignment, including its creation, updates, and deletion. Conversely, setting it to `false` indicates that the role assignment is not managed by Harness, and thus Harness will not perform actions on it. Default value should be `false`.
func (o LookupRoleAssignmentsResultOutput) Managed() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupRoleAssignmentsResult) bool { return v.Managed }).(pulumi.BoolOutput)
}

// Org identifier.
func (o LookupRoleAssignmentsResultOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupRoleAssignmentsResult) *string { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Principal.
func (o LookupRoleAssignmentsResultOutput) Principals() GetRoleAssignmentsPrincipalArrayOutput {
	return o.ApplyT(func(v LookupRoleAssignmentsResult) []GetRoleAssignmentsPrincipal { return v.Principals }).(GetRoleAssignmentsPrincipalArrayOutput)
}

// Project Identifier
func (o LookupRoleAssignmentsResultOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupRoleAssignmentsResult) *string { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Resource group identifier.
func (o LookupRoleAssignmentsResultOutput) ResourceGroupIdentifier() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRoleAssignmentsResult) string { return v.ResourceGroupIdentifier }).(pulumi.StringOutput)
}

// Role identifier.
func (o LookupRoleAssignmentsResultOutput) RoleIdentifier() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRoleAssignmentsResult) string { return v.RoleIdentifier }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupRoleAssignmentsResultOutput{})
}
