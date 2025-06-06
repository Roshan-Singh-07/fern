# This file was auto-generated by Fern from our API Definition.

from ......core.pydantic_utilities import UniversalBaseModel
import typing
from .error import Error
import pydantic
class PutResponse(UniversalBaseModel):
    errors: typing.Optional[typing.List[Error]] = None
    
    class Config:
        extra = pydantic.Extra.forbid
