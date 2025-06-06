# This file was auto-generated by Fern from our API Definition.

from ......core.pydantic_utilities import UniversalBaseModel
import pydantic
class Cat(UniversalBaseModel):
    name: str
    likes_to_meow: bool = pydantic.Field(alias="likesToMeow")
    
    class Config:
        extra = pydantic.Extra.forbid
