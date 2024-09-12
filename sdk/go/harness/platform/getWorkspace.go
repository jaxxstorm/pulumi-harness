// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source for retrieving workspaces.
//
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
//			_, err := platform.LookupWorkspace(ctx, &platform.LookupWorkspaceArgs{
//				Identifier: "identifier",
//				OrgId:      "org_id",
//				ProjectId:  "project_id",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupWorkspace(ctx *pulumi.Context, args *LookupWorkspaceArgs, opts ...pulumi.InvokeOption) (*LookupWorkspaceResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupWorkspaceResult
	err := ctx.Invoke("harness:platform/getWorkspace:getWorkspace", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getWorkspace.
type LookupWorkspaceArgs struct {
	// Description of the Workspace
	Description *string `pulumi:"description"`
	// Environment variables configured on the workspace
	EnvironmentVariables []GetWorkspaceEnvironmentVariable `pulumi:"environmentVariables"`
	// Identifier of the Workspace
	Identifier string `pulumi:"identifier"`
	// Organization Identifier
	OrgId string `pulumi:"orgId"`
	// Project Identifier
	ProjectId string `pulumi:"projectId"`
	// Repository Branch in which the code should be accessed
	RepositoryBranch *string `pulumi:"repositoryBranch"`
	// Repository Tag in which the code should be accessed
	RepositoryCommit *string `pulumi:"repositoryCommit"`
	// Repository SHA in which the code should be accessed
	RepositorySha          *string                             `pulumi:"repositorySha"`
	TerraformVariableFiles []GetWorkspaceTerraformVariableFile `pulumi:"terraformVariableFiles"`
	TerraformVariables     []GetWorkspaceTerraformVariable     `pulumi:"terraformVariables"`
}

// A collection of values returned by getWorkspace.
type LookupWorkspaceResult struct {
	// If enabled cost estimation operations will be performed in this workspace
	CostEstimationEnabled bool              `pulumi:"costEstimationEnabled"`
	DefaultPipelines      map[string]string `pulumi:"defaultPipelines"`
	// Description of the Workspace
	Description string `pulumi:"description"`
	// Environment variables configured on the workspace
	EnvironmentVariables []GetWorkspaceEnvironmentVariable `pulumi:"environmentVariables"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Identifier of the Workspace
	Identifier string `pulumi:"identifier"`
	// Name of the Workspace
	Name string `pulumi:"name"`
	// Organization Identifier
	OrgId string `pulumi:"orgId"`
	// Project Identifier
	ProjectId string `pulumi:"projectId"`
	// Provider Connector is the reference to the connector for the infrastructure provider
	ProviderConnector string `pulumi:"providerConnector"`
	// Provisioner type defines the provisioning tool to use.
	ProvisionerType string `pulumi:"provisionerType"`
	// Provisioner Version defines the tool version to use
	ProvisionerVersion string `pulumi:"provisionerVersion"`
	// Repository is the name of the repository to use
	Repository string `pulumi:"repository"`
	// Repository Branch in which the code should be accessed
	RepositoryBranch string `pulumi:"repositoryBranch"`
	// Repository Tag in which the code should be accessed
	RepositoryCommit string `pulumi:"repositoryCommit"`
	// Repository Connector is the reference to the connector to use for this code
	RepositoryConnector string `pulumi:"repositoryConnector"`
	// Repository Path is the path in which the infra code resides
	RepositoryPath string `pulumi:"repositoryPath"`
	// Repository SHA in which the code should be accessed
	RepositorySha          string                              `pulumi:"repositorySha"`
	TerraformVariableFiles []GetWorkspaceTerraformVariableFile `pulumi:"terraformVariableFiles"`
	TerraformVariables     []GetWorkspaceTerraformVariable     `pulumi:"terraformVariables"`
}

func LookupWorkspaceOutput(ctx *pulumi.Context, args LookupWorkspaceOutputArgs, opts ...pulumi.InvokeOption) LookupWorkspaceResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupWorkspaceResult, error) {
			args := v.(LookupWorkspaceArgs)
			r, err := LookupWorkspace(ctx, &args, opts...)
			var s LookupWorkspaceResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupWorkspaceResultOutput)
}

// A collection of arguments for invoking getWorkspace.
type LookupWorkspaceOutputArgs struct {
	// Description of the Workspace
	Description pulumi.StringPtrInput `pulumi:"description"`
	// Environment variables configured on the workspace
	EnvironmentVariables GetWorkspaceEnvironmentVariableArrayInput `pulumi:"environmentVariables"`
	// Identifier of the Workspace
	Identifier pulumi.StringInput `pulumi:"identifier"`
	// Organization Identifier
	OrgId pulumi.StringInput `pulumi:"orgId"`
	// Project Identifier
	ProjectId pulumi.StringInput `pulumi:"projectId"`
	// Repository Branch in which the code should be accessed
	RepositoryBranch pulumi.StringPtrInput `pulumi:"repositoryBranch"`
	// Repository Tag in which the code should be accessed
	RepositoryCommit pulumi.StringPtrInput `pulumi:"repositoryCommit"`
	// Repository SHA in which the code should be accessed
	RepositorySha          pulumi.StringPtrInput                       `pulumi:"repositorySha"`
	TerraformVariableFiles GetWorkspaceTerraformVariableFileArrayInput `pulumi:"terraformVariableFiles"`
	TerraformVariables     GetWorkspaceTerraformVariableArrayInput     `pulumi:"terraformVariables"`
}

func (LookupWorkspaceOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupWorkspaceArgs)(nil)).Elem()
}

// A collection of values returned by getWorkspace.
type LookupWorkspaceResultOutput struct{ *pulumi.OutputState }

func (LookupWorkspaceResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupWorkspaceResult)(nil)).Elem()
}

func (o LookupWorkspaceResultOutput) ToLookupWorkspaceResultOutput() LookupWorkspaceResultOutput {
	return o
}

func (o LookupWorkspaceResultOutput) ToLookupWorkspaceResultOutputWithContext(ctx context.Context) LookupWorkspaceResultOutput {
	return o
}

// If enabled cost estimation operations will be performed in this workspace
func (o LookupWorkspaceResultOutput) CostEstimationEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupWorkspaceResult) bool { return v.CostEstimationEnabled }).(pulumi.BoolOutput)
}

func (o LookupWorkspaceResultOutput) DefaultPipelines() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupWorkspaceResult) map[string]string { return v.DefaultPipelines }).(pulumi.StringMapOutput)
}

// Description of the Workspace
func (o LookupWorkspaceResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWorkspaceResult) string { return v.Description }).(pulumi.StringOutput)
}

// Environment variables configured on the workspace
func (o LookupWorkspaceResultOutput) EnvironmentVariables() GetWorkspaceEnvironmentVariableArrayOutput {
	return o.ApplyT(func(v LookupWorkspaceResult) []GetWorkspaceEnvironmentVariable { return v.EnvironmentVariables }).(GetWorkspaceEnvironmentVariableArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupWorkspaceResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWorkspaceResult) string { return v.Id }).(pulumi.StringOutput)
}

// Identifier of the Workspace
func (o LookupWorkspaceResultOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWorkspaceResult) string { return v.Identifier }).(pulumi.StringOutput)
}

// Name of the Workspace
func (o LookupWorkspaceResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWorkspaceResult) string { return v.Name }).(pulumi.StringOutput)
}

// Organization Identifier
func (o LookupWorkspaceResultOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWorkspaceResult) string { return v.OrgId }).(pulumi.StringOutput)
}

// Project Identifier
func (o LookupWorkspaceResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWorkspaceResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

// Provider Connector is the reference to the connector for the infrastructure provider
func (o LookupWorkspaceResultOutput) ProviderConnector() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWorkspaceResult) string { return v.ProviderConnector }).(pulumi.StringOutput)
}

// Provisioner type defines the provisioning tool to use.
func (o LookupWorkspaceResultOutput) ProvisionerType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWorkspaceResult) string { return v.ProvisionerType }).(pulumi.StringOutput)
}

// Provisioner Version defines the tool version to use
func (o LookupWorkspaceResultOutput) ProvisionerVersion() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWorkspaceResult) string { return v.ProvisionerVersion }).(pulumi.StringOutput)
}

// Repository is the name of the repository to use
func (o LookupWorkspaceResultOutput) Repository() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWorkspaceResult) string { return v.Repository }).(pulumi.StringOutput)
}

// Repository Branch in which the code should be accessed
func (o LookupWorkspaceResultOutput) RepositoryBranch() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWorkspaceResult) string { return v.RepositoryBranch }).(pulumi.StringOutput)
}

// Repository Tag in which the code should be accessed
func (o LookupWorkspaceResultOutput) RepositoryCommit() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWorkspaceResult) string { return v.RepositoryCommit }).(pulumi.StringOutput)
}

// Repository Connector is the reference to the connector to use for this code
func (o LookupWorkspaceResultOutput) RepositoryConnector() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWorkspaceResult) string { return v.RepositoryConnector }).(pulumi.StringOutput)
}

// Repository Path is the path in which the infra code resides
func (o LookupWorkspaceResultOutput) RepositoryPath() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWorkspaceResult) string { return v.RepositoryPath }).(pulumi.StringOutput)
}

// Repository SHA in which the code should be accessed
func (o LookupWorkspaceResultOutput) RepositorySha() pulumi.StringOutput {
	return o.ApplyT(func(v LookupWorkspaceResult) string { return v.RepositorySha }).(pulumi.StringOutput)
}

func (o LookupWorkspaceResultOutput) TerraformVariableFiles() GetWorkspaceTerraformVariableFileArrayOutput {
	return o.ApplyT(func(v LookupWorkspaceResult) []GetWorkspaceTerraformVariableFile { return v.TerraformVariableFiles }).(GetWorkspaceTerraformVariableFileArrayOutput)
}

func (o LookupWorkspaceResultOutput) TerraformVariables() GetWorkspaceTerraformVariableArrayOutput {
	return o.ApplyT(func(v LookupWorkspaceResult) []GetWorkspaceTerraformVariable { return v.TerraformVariables }).(GetWorkspaceTerraformVariableArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupWorkspaceResultOutput{})
}
