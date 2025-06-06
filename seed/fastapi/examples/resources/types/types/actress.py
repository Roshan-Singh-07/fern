# This file was auto-generated by Fern from our API Definition.

from ....core.pydantic_utilities import UniversalBaseModel
from ....core.pydantic_utilities import IS_PYDANTIC_V2
import typing
import pydantic
class Actress(UniversalBaseModel):
    """
    Examples
    --------
    from seed.examples.resources.types import Actress
    
    Actress(
        name="Jennifer Lawrence",
        id="actor_456",
    )
    """
    name: str
    id: str
    
    if IS_PYDANTIC_V2:
        model_config: typing.ClassVar[pydantic.ConfigDict] = pydantic.ConfigDict(extra="forbid")  # type: ignore # Pydantic v2
    else:
        class Config:
            extra = pydantic.Extra.forbid
