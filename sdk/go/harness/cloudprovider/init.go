// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudprovider

import (
	"fmt"

	"github.com/blang/semver"
	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type module struct {
	version semver.Version
}

func (m *module) Version() semver.Version {
	return m.version
}

func (m *module) Construct(ctx *pulumi.Context, name, typ, urn string) (r pulumi.Resource, err error) {
	switch typ {
	case "harness:cloudprovider/aws:Aws":
		r = &Aws{}
	case "harness:cloudprovider/azure:Azure":
		r = &Azure{}
	case "harness:cloudprovider/datacenter:Datacenter":
		r = &Datacenter{}
	case "harness:cloudprovider/gcp:Gcp":
		r = &Gcp{}
	case "harness:cloudprovider/kubernetes:Kubernetes":
		r = &Kubernetes{}
	case "harness:cloudprovider/spot:Spot":
		r = &Spot{}
	case "harness:cloudprovider/tanzu:Tanzu":
		r = &Tanzu{}
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	err = ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return
}

func init() {
	version, err := internal.PkgVersion()
	if err != nil {
		version = semver.Version{Major: 1}
	}
	pulumi.RegisterResourceModule(
		"harness",
		"cloudprovider/aws",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"cloudprovider/azure",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"cloudprovider/datacenter",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"cloudprovider/gcp",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"cloudprovider/kubernetes",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"cloudprovider/spot",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"harness",
		"cloudprovider/tanzu",
		&module{version},
	)
}
