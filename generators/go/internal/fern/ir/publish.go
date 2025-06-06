// This file was auto-generated by Fern from our API Definition.

package ir

import (
	json "encoding/json"
	fmt "fmt"
	internal "github.com/fern-api/fern-go/internal/fern/ir/internal"
)

type DirectPublish struct {
	Target *PublishTarget `json:"target,omitempty" url:"target,omitempty"`

	extraProperties map[string]interface{}
}

func (d *DirectPublish) GetTarget() *PublishTarget {
	if d == nil {
		return nil
	}
	return d.Target
}

func (d *DirectPublish) GetExtraProperties() map[string]interface{} {
	return d.extraProperties
}

func (d *DirectPublish) UnmarshalJSON(data []byte) error {
	type unmarshaler DirectPublish
	var value unmarshaler
	if err := json.Unmarshal(data, &value); err != nil {
		return err
	}
	*d = DirectPublish(value)
	extraProperties, err := internal.ExtractExtraProperties(data, *d)
	if err != nil {
		return err
	}
	d.extraProperties = extraProperties
	return nil
}

func (d *DirectPublish) String() string {
	if value, err := internal.StringifyJSON(d); err == nil {
		return value
	}
	return fmt.Sprintf("%#v", d)
}

type GithubPublish struct {
	Owner  string         `json:"owner" url:"owner"`
	Repo   string         `json:"repo" url:"repo"`
	Target *PublishTarget `json:"target,omitempty" url:"target,omitempty"`

	extraProperties map[string]interface{}
}

func (g *GithubPublish) GetOwner() string {
	if g == nil {
		return ""
	}
	return g.Owner
}

func (g *GithubPublish) GetRepo() string {
	if g == nil {
		return ""
	}
	return g.Repo
}

func (g *GithubPublish) GetTarget() *PublishTarget {
	if g == nil {
		return nil
	}
	return g.Target
}

func (g *GithubPublish) GetExtraProperties() map[string]interface{} {
	return g.extraProperties
}

func (g *GithubPublish) UnmarshalJSON(data []byte) error {
	type unmarshaler GithubPublish
	var value unmarshaler
	if err := json.Unmarshal(data, &value); err != nil {
		return err
	}
	*g = GithubPublish(value)
	extraProperties, err := internal.ExtractExtraProperties(data, *g)
	if err != nil {
		return err
	}
	g.extraProperties = extraProperties
	return nil
}

func (g *GithubPublish) String() string {
	if value, err := internal.StringifyJSON(g); err == nil {
		return value
	}
	return fmt.Sprintf("%#v", g)
}

type PostmanPublishTarget struct {
	ApiKey       string  `json:"apiKey" url:"apiKey"`
	WorkspaceId  string  `json:"workspaceId" url:"workspaceId"`
	CollectionId *string `json:"collectionId,omitempty" url:"collectionId,omitempty"`

	extraProperties map[string]interface{}
}

func (p *PostmanPublishTarget) GetApiKey() string {
	if p == nil {
		return ""
	}
	return p.ApiKey
}

func (p *PostmanPublishTarget) GetWorkspaceId() string {
	if p == nil {
		return ""
	}
	return p.WorkspaceId
}

func (p *PostmanPublishTarget) GetCollectionId() *string {
	if p == nil {
		return nil
	}
	return p.CollectionId
}

func (p *PostmanPublishTarget) GetExtraProperties() map[string]interface{} {
	return p.extraProperties
}

func (p *PostmanPublishTarget) UnmarshalJSON(data []byte) error {
	type unmarshaler PostmanPublishTarget
	var value unmarshaler
	if err := json.Unmarshal(data, &value); err != nil {
		return err
	}
	*p = PostmanPublishTarget(value)
	extraProperties, err := internal.ExtractExtraProperties(data, *p)
	if err != nil {
		return err
	}
	p.extraProperties = extraProperties
	return nil
}

func (p *PostmanPublishTarget) String() string {
	if value, err := internal.StringifyJSON(p); err == nil {
		return value
	}
	return fmt.Sprintf("%#v", p)
}

type PublishTarget struct {
	Type    string
	Postman *PostmanPublishTarget
}

func NewPublishTargetFromPostman(value *PostmanPublishTarget) *PublishTarget {
	return &PublishTarget{Type: "postman", Postman: value}
}

func (p *PublishTarget) GetType() string {
	if p == nil {
		return ""
	}
	return p.Type
}

func (p *PublishTarget) GetPostman() *PostmanPublishTarget {
	if p == nil {
		return nil
	}
	return p.Postman
}

func (p *PublishTarget) UnmarshalJSON(data []byte) error {
	var unmarshaler struct {
		Type string `json:"type"`
	}
	if err := json.Unmarshal(data, &unmarshaler); err != nil {
		return err
	}
	p.Type = unmarshaler.Type
	if unmarshaler.Type == "" {
		return fmt.Errorf("%T did not include discriminant type", p)
	}
	switch unmarshaler.Type {
	case "postman":
		value := new(PostmanPublishTarget)
		if err := json.Unmarshal(data, &value); err != nil {
			return err
		}
		p.Postman = value
	}
	return nil
}

func (p PublishTarget) MarshalJSON() ([]byte, error) {
	if err := p.validate(); err != nil {
		return nil, err
	}
	switch p.Type {
	default:
		return nil, fmt.Errorf("invalid type %s in %T", p.Type, p)
	case "postman":
		return internal.MarshalJSONWithExtraProperty(p.Postman, "type", "postman")
	}
}

type PublishTargetVisitor interface {
	VisitPostman(*PostmanPublishTarget) error
}

func (p *PublishTarget) Accept(visitor PublishTargetVisitor) error {
	switch p.Type {
	default:
		return fmt.Errorf("invalid type %s in %T", p.Type, p)
	case "postman":
		return visitor.VisitPostman(p.Postman)
	}
}

func (p *PublishTarget) validate() error {
	if p == nil {
		return fmt.Errorf("type %T is nil", p)
	}
	var fields []string
	if p.Postman != nil {
		fields = append(fields, "postman")
	}
	if len(fields) == 0 {
		if p.Type != "" {
			return fmt.Errorf("type %T defines a discriminant set to %q but the field is not set", p, p.Type)
		}
		return fmt.Errorf("type %T is empty", p)
	}
	if len(fields) > 1 {
		return fmt.Errorf("type %T defines values for %s, but only one value is allowed", p, fields)
	}
	if p.Type != "" {
		field := fields[0]
		if p.Type != field {
			return fmt.Errorf(
				"type %T defines a discriminant set to %q, but it does not match the %T field; either remove or update the discriminant to match",
				p,
				p.Type,
				p,
			)
		}
	}
	return nil
}

type PublishingConfig struct {
	Type string
	// Publish via syncing to a GitHub repo and triggering GitHub workflows
	Github *GithubPublish
	// Publish directly from the generator
	Direct *DirectPublish
}

func NewPublishingConfigFromGithub(value *GithubPublish) *PublishingConfig {
	return &PublishingConfig{Type: "github", Github: value}
}

func NewPublishingConfigFromDirect(value *DirectPublish) *PublishingConfig {
	return &PublishingConfig{Type: "direct", Direct: value}
}

func (p *PublishingConfig) GetType() string {
	if p == nil {
		return ""
	}
	return p.Type
}

func (p *PublishingConfig) GetGithub() *GithubPublish {
	if p == nil {
		return nil
	}
	return p.Github
}

func (p *PublishingConfig) GetDirect() *DirectPublish {
	if p == nil {
		return nil
	}
	return p.Direct
}

func (p *PublishingConfig) UnmarshalJSON(data []byte) error {
	var unmarshaler struct {
		Type string `json:"type"`
	}
	if err := json.Unmarshal(data, &unmarshaler); err != nil {
		return err
	}
	p.Type = unmarshaler.Type
	if unmarshaler.Type == "" {
		return fmt.Errorf("%T did not include discriminant type", p)
	}
	switch unmarshaler.Type {
	case "github":
		value := new(GithubPublish)
		if err := json.Unmarshal(data, &value); err != nil {
			return err
		}
		p.Github = value
	case "direct":
		value := new(DirectPublish)
		if err := json.Unmarshal(data, &value); err != nil {
			return err
		}
		p.Direct = value
	}
	return nil
}

func (p PublishingConfig) MarshalJSON() ([]byte, error) {
	if err := p.validate(); err != nil {
		return nil, err
	}
	switch p.Type {
	default:
		return nil, fmt.Errorf("invalid type %s in %T", p.Type, p)
	case "github":
		return internal.MarshalJSONWithExtraProperty(p.Github, "type", "github")
	case "direct":
		return internal.MarshalJSONWithExtraProperty(p.Direct, "type", "direct")
	}
}

type PublishingConfigVisitor interface {
	VisitGithub(*GithubPublish) error
	VisitDirect(*DirectPublish) error
}

func (p *PublishingConfig) Accept(visitor PublishingConfigVisitor) error {
	switch p.Type {
	default:
		return fmt.Errorf("invalid type %s in %T", p.Type, p)
	case "github":
		return visitor.VisitGithub(p.Github)
	case "direct":
		return visitor.VisitDirect(p.Direct)
	}
}

func (p *PublishingConfig) validate() error {
	if p == nil {
		return fmt.Errorf("type %T is nil", p)
	}
	var fields []string
	if p.Github != nil {
		fields = append(fields, "github")
	}
	if p.Direct != nil {
		fields = append(fields, "direct")
	}
	if len(fields) == 0 {
		if p.Type != "" {
			return fmt.Errorf("type %T defines a discriminant set to %q but the field is not set", p, p.Type)
		}
		return fmt.Errorf("type %T is empty", p)
	}
	if len(fields) > 1 {
		return fmt.Errorf("type %T defines values for %s, but only one value is allowed", p, fields)
	}
	if p.Type != "" {
		field := fields[0]
		if p.Type != field {
			return fmt.Errorf(
				"type %T defines a discriminant set to %q, but it does not match the %T field; either remove or update the discriminant to match",
				p,
				p.Type,
				p,
			)
		}
	}
	return nil
}
