# This file was auto-generated by Fern from our API Definition.

from __future__ import annotations
from ......core.pydantic_utilities import UniversalBaseModel
import typing
from .parameter import Parameter
import pydantic
from ......core.pydantic_utilities import IS_PYDANTIC_V2
from ......core.pydantic_utilities import update_forward_refs
class VoidFunctionSignatureThatTakesActualResult(UniversalBaseModel):
    parameters: typing.List[Parameter]
    actual_result_type: "VariableType" = pydantic.Field(alias="actualResultType")
    
    if IS_PYDANTIC_V2:
        model_config: typing.ClassVar[pydantic.ConfigDict] = pydantic.ConfigDict(extra="forbid")  # type: ignore # Pydantic v2
    else:
        class Config:
            extra = pydantic.Extra.forbid
from .....commons.types.variable_type import VariableType # noqa: E402, F401, I001
update_forward_refs(VoidFunctionSignatureThatTakesActualResult)
