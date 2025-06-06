# This file was auto-generated by Fern from our API Definition.

from __future__ import annotations

import datetime as dt
import typing

import pydantic
import typing_extensions
from ...core.pydantic_utilities import IS_PYDANTIC_V2, UniversalBaseModel
from ...core.serialization import FieldMetadata


class Base(UniversalBaseModel):
    id: str
    created_at: typing_extensions.Annotated[dt.datetime, FieldMetadata(alias="created-at")]
    archived_at: typing_extensions.Annotated[typing.Optional[dt.datetime], FieldMetadata(alias="archived-at")] = None

    if IS_PYDANTIC_V2:
        model_config: typing.ClassVar[pydantic.ConfigDict] = pydantic.ConfigDict(extra="allow", frozen=True)  # type: ignore # Pydantic v2
    else:

        class Config:
            frozen = True
            smart_union = True
            extra = pydantic.Extra.allow


class NormalSweetBigUnion(Base):
    type: typing.Literal["normalSweet"] = "normalSweet"
    value: str

    if IS_PYDANTIC_V2:
        model_config: typing.ClassVar[pydantic.ConfigDict] = pydantic.ConfigDict(extra="allow", frozen=True)  # type: ignore # Pydantic v2
    else:

        class Config:
            frozen = True
            smart_union = True
            extra = pydantic.Extra.allow


class ThankfulFactorBigUnion(Base):
    type: typing.Literal["thankfulFactor"] = "thankfulFactor"
    value: str

    if IS_PYDANTIC_V2:
        model_config: typing.ClassVar[pydantic.ConfigDict] = pydantic.ConfigDict(extra="allow", frozen=True)  # type: ignore # Pydantic v2
    else:

        class Config:
            frozen = True
            smart_union = True
            extra = pydantic.Extra.allow


class JumboEndBigUnion(Base):
    type: typing.Literal["jumboEnd"] = "jumboEnd"
    value: str

    if IS_PYDANTIC_V2:
        model_config: typing.ClassVar[pydantic.ConfigDict] = pydantic.ConfigDict(extra="allow", frozen=True)  # type: ignore # Pydantic v2
    else:

        class Config:
            frozen = True
            smart_union = True
            extra = pydantic.Extra.allow


class HastyPainBigUnion(Base):
    type: typing.Literal["hastyPain"] = "hastyPain"
    value: str

    if IS_PYDANTIC_V2:
        model_config: typing.ClassVar[pydantic.ConfigDict] = pydantic.ConfigDict(extra="allow", frozen=True)  # type: ignore # Pydantic v2
    else:

        class Config:
            frozen = True
            smart_union = True
            extra = pydantic.Extra.allow


class MistySnowBigUnion(Base):
    type: typing.Literal["mistySnow"] = "mistySnow"
    value: str

    if IS_PYDANTIC_V2:
        model_config: typing.ClassVar[pydantic.ConfigDict] = pydantic.ConfigDict(extra="allow", frozen=True)  # type: ignore # Pydantic v2
    else:

        class Config:
            frozen = True
            smart_union = True
            extra = pydantic.Extra.allow


class DistinctFailureBigUnion(Base):
    type: typing.Literal["distinctFailure"] = "distinctFailure"
    value: str

    if IS_PYDANTIC_V2:
        model_config: typing.ClassVar[pydantic.ConfigDict] = pydantic.ConfigDict(extra="allow", frozen=True)  # type: ignore # Pydantic v2
    else:

        class Config:
            frozen = True
            smart_union = True
            extra = pydantic.Extra.allow


class PracticalPrincipleBigUnion(Base):
    type: typing.Literal["practicalPrinciple"] = "practicalPrinciple"
    value: str

    if IS_PYDANTIC_V2:
        model_config: typing.ClassVar[pydantic.ConfigDict] = pydantic.ConfigDict(extra="allow", frozen=True)  # type: ignore # Pydantic v2
    else:

        class Config:
            frozen = True
            smart_union = True
            extra = pydantic.Extra.allow


class LimpingStepBigUnion(Base):
    type: typing.Literal["limpingStep"] = "limpingStep"
    value: str

    if IS_PYDANTIC_V2:
        model_config: typing.ClassVar[pydantic.ConfigDict] = pydantic.ConfigDict(extra="allow", frozen=True)  # type: ignore # Pydantic v2
    else:

        class Config:
            frozen = True
            smart_union = True
            extra = pydantic.Extra.allow


class VibrantExcitementBigUnion(Base):
    type: typing.Literal["vibrantExcitement"] = "vibrantExcitement"
    value: str

    if IS_PYDANTIC_V2:
        model_config: typing.ClassVar[pydantic.ConfigDict] = pydantic.ConfigDict(extra="allow", frozen=True)  # type: ignore # Pydantic v2
    else:

        class Config:
            frozen = True
            smart_union = True
            extra = pydantic.Extra.allow


class ActiveDiamondBigUnion(Base):
    type: typing.Literal["activeDiamond"] = "activeDiamond"
    value: str

    if IS_PYDANTIC_V2:
        model_config: typing.ClassVar[pydantic.ConfigDict] = pydantic.ConfigDict(extra="allow", frozen=True)  # type: ignore # Pydantic v2
    else:

        class Config:
            frozen = True
            smart_union = True
            extra = pydantic.Extra.allow


class PopularLimitBigUnion(Base):
    type: typing.Literal["popularLimit"] = "popularLimit"
    value: str

    if IS_PYDANTIC_V2:
        model_config: typing.ClassVar[pydantic.ConfigDict] = pydantic.ConfigDict(extra="allow", frozen=True)  # type: ignore # Pydantic v2
    else:

        class Config:
            frozen = True
            smart_union = True
            extra = pydantic.Extra.allow


class FalseMirrorBigUnion(Base):
    type: typing.Literal["falseMirror"] = "falseMirror"
    value: str

    if IS_PYDANTIC_V2:
        model_config: typing.ClassVar[pydantic.ConfigDict] = pydantic.ConfigDict(extra="allow", frozen=True)  # type: ignore # Pydantic v2
    else:

        class Config:
            frozen = True
            smart_union = True
            extra = pydantic.Extra.allow


class PrimaryBlockBigUnion(Base):
    type: typing.Literal["primaryBlock"] = "primaryBlock"
    value: str

    if IS_PYDANTIC_V2:
        model_config: typing.ClassVar[pydantic.ConfigDict] = pydantic.ConfigDict(extra="allow", frozen=True)  # type: ignore # Pydantic v2
    else:

        class Config:
            frozen = True
            smart_union = True
            extra = pydantic.Extra.allow


class RotatingRatioBigUnion(Base):
    type: typing.Literal["rotatingRatio"] = "rotatingRatio"
    value: str

    if IS_PYDANTIC_V2:
        model_config: typing.ClassVar[pydantic.ConfigDict] = pydantic.ConfigDict(extra="allow", frozen=True)  # type: ignore # Pydantic v2
    else:

        class Config:
            frozen = True
            smart_union = True
            extra = pydantic.Extra.allow


class ColorfulCoverBigUnion(Base):
    type: typing.Literal["colorfulCover"] = "colorfulCover"
    value: str

    if IS_PYDANTIC_V2:
        model_config: typing.ClassVar[pydantic.ConfigDict] = pydantic.ConfigDict(extra="allow", frozen=True)  # type: ignore # Pydantic v2
    else:

        class Config:
            frozen = True
            smart_union = True
            extra = pydantic.Extra.allow


class DisloyalValueBigUnion(Base):
    type: typing.Literal["disloyalValue"] = "disloyalValue"
    value: str

    if IS_PYDANTIC_V2:
        model_config: typing.ClassVar[pydantic.ConfigDict] = pydantic.ConfigDict(extra="allow", frozen=True)  # type: ignore # Pydantic v2
    else:

        class Config:
            frozen = True
            smart_union = True
            extra = pydantic.Extra.allow


class GruesomeCoachBigUnion(Base):
    type: typing.Literal["gruesomeCoach"] = "gruesomeCoach"
    value: str

    if IS_PYDANTIC_V2:
        model_config: typing.ClassVar[pydantic.ConfigDict] = pydantic.ConfigDict(extra="allow", frozen=True)  # type: ignore # Pydantic v2
    else:

        class Config:
            frozen = True
            smart_union = True
            extra = pydantic.Extra.allow


class TotalWorkBigUnion(Base):
    type: typing.Literal["totalWork"] = "totalWork"
    value: str

    if IS_PYDANTIC_V2:
        model_config: typing.ClassVar[pydantic.ConfigDict] = pydantic.ConfigDict(extra="allow", frozen=True)  # type: ignore # Pydantic v2
    else:

        class Config:
            frozen = True
            smart_union = True
            extra = pydantic.Extra.allow


class HarmoniousPlayBigUnion(Base):
    type: typing.Literal["harmoniousPlay"] = "harmoniousPlay"
    value: str

    if IS_PYDANTIC_V2:
        model_config: typing.ClassVar[pydantic.ConfigDict] = pydantic.ConfigDict(extra="allow", frozen=True)  # type: ignore # Pydantic v2
    else:

        class Config:
            frozen = True
            smart_union = True
            extra = pydantic.Extra.allow


class UniqueStressBigUnion(Base):
    type: typing.Literal["uniqueStress"] = "uniqueStress"
    value: str

    if IS_PYDANTIC_V2:
        model_config: typing.ClassVar[pydantic.ConfigDict] = pydantic.ConfigDict(extra="allow", frozen=True)  # type: ignore # Pydantic v2
    else:

        class Config:
            frozen = True
            smart_union = True
            extra = pydantic.Extra.allow


class UnwillingSmokeBigUnion(Base):
    type: typing.Literal["unwillingSmoke"] = "unwillingSmoke"
    value: str

    if IS_PYDANTIC_V2:
        model_config: typing.ClassVar[pydantic.ConfigDict] = pydantic.ConfigDict(extra="allow", frozen=True)  # type: ignore # Pydantic v2
    else:

        class Config:
            frozen = True
            smart_union = True
            extra = pydantic.Extra.allow


class FrozenSleepBigUnion(Base):
    type: typing.Literal["frozenSleep"] = "frozenSleep"
    value: str

    if IS_PYDANTIC_V2:
        model_config: typing.ClassVar[pydantic.ConfigDict] = pydantic.ConfigDict(extra="allow", frozen=True)  # type: ignore # Pydantic v2
    else:

        class Config:
            frozen = True
            smart_union = True
            extra = pydantic.Extra.allow


class DiligentDealBigUnion(Base):
    type: typing.Literal["diligentDeal"] = "diligentDeal"
    value: str

    if IS_PYDANTIC_V2:
        model_config: typing.ClassVar[pydantic.ConfigDict] = pydantic.ConfigDict(extra="allow", frozen=True)  # type: ignore # Pydantic v2
    else:

        class Config:
            frozen = True
            smart_union = True
            extra = pydantic.Extra.allow


class AttractiveScriptBigUnion(Base):
    type: typing.Literal["attractiveScript"] = "attractiveScript"
    value: str

    if IS_PYDANTIC_V2:
        model_config: typing.ClassVar[pydantic.ConfigDict] = pydantic.ConfigDict(extra="allow", frozen=True)  # type: ignore # Pydantic v2
    else:

        class Config:
            frozen = True
            smart_union = True
            extra = pydantic.Extra.allow


class HoarseMouseBigUnion(Base):
    type: typing.Literal["hoarseMouse"] = "hoarseMouse"
    value: str

    if IS_PYDANTIC_V2:
        model_config: typing.ClassVar[pydantic.ConfigDict] = pydantic.ConfigDict(extra="allow", frozen=True)  # type: ignore # Pydantic v2
    else:

        class Config:
            frozen = True
            smart_union = True
            extra = pydantic.Extra.allow


class CircularCardBigUnion(Base):
    type: typing.Literal["circularCard"] = "circularCard"
    value: str

    if IS_PYDANTIC_V2:
        model_config: typing.ClassVar[pydantic.ConfigDict] = pydantic.ConfigDict(extra="allow", frozen=True)  # type: ignore # Pydantic v2
    else:

        class Config:
            frozen = True
            smart_union = True
            extra = pydantic.Extra.allow


class PotableBadBigUnion(Base):
    type: typing.Literal["potableBad"] = "potableBad"
    value: str

    if IS_PYDANTIC_V2:
        model_config: typing.ClassVar[pydantic.ConfigDict] = pydantic.ConfigDict(extra="allow", frozen=True)  # type: ignore # Pydantic v2
    else:

        class Config:
            frozen = True
            smart_union = True
            extra = pydantic.Extra.allow


class TriangularRepairBigUnion(Base):
    type: typing.Literal["triangularRepair"] = "triangularRepair"
    value: str

    if IS_PYDANTIC_V2:
        model_config: typing.ClassVar[pydantic.ConfigDict] = pydantic.ConfigDict(extra="allow", frozen=True)  # type: ignore # Pydantic v2
    else:

        class Config:
            frozen = True
            smart_union = True
            extra = pydantic.Extra.allow


class GaseousRoadBigUnion(Base):
    type: typing.Literal["gaseousRoad"] = "gaseousRoad"
    value: str

    if IS_PYDANTIC_V2:
        model_config: typing.ClassVar[pydantic.ConfigDict] = pydantic.ConfigDict(extra="allow", frozen=True)  # type: ignore # Pydantic v2
    else:

        class Config:
            frozen = True
            smart_union = True
            extra = pydantic.Extra.allow


BigUnion = typing.Union[
    NormalSweetBigUnion,
    ThankfulFactorBigUnion,
    JumboEndBigUnion,
    HastyPainBigUnion,
    MistySnowBigUnion,
    DistinctFailureBigUnion,
    PracticalPrincipleBigUnion,
    LimpingStepBigUnion,
    VibrantExcitementBigUnion,
    ActiveDiamondBigUnion,
    PopularLimitBigUnion,
    FalseMirrorBigUnion,
    PrimaryBlockBigUnion,
    RotatingRatioBigUnion,
    ColorfulCoverBigUnion,
    DisloyalValueBigUnion,
    GruesomeCoachBigUnion,
    TotalWorkBigUnion,
    HarmoniousPlayBigUnion,
    UniqueStressBigUnion,
    UnwillingSmokeBigUnion,
    FrozenSleepBigUnion,
    DiligentDealBigUnion,
    AttractiveScriptBigUnion,
    HoarseMouseBigUnion,
    CircularCardBigUnion,
    PotableBadBigUnion,
    TriangularRepairBigUnion,
    GaseousRoadBigUnion,
]
