package pidevguru.piwebapi.webid;

import pidevguru.piwebapi.models.*;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.UUID;

public class WebIdGenerator
{

    public String generateWebIdByPath(String path, Class type, Class ownerType) throws WebIdException {
        validateTypeAndownerType(type, ownerType);
        String marker = getMarker(type);
        String ownerMarker = getOwnerMarker(ownerType);

        if (path.substring(0,2).equals("\\\\"))
        {
            path = path.substring(2, path.length());
        }
        String encodedPath = encode(path.toUpperCase());
        return ("P1" + marker + ownerMarker + encodedPath);
    }

    private void validateTypeAndownerType(Class type, Class ownerType) throws WebIdException {
        if (type == PWAAttribute.class)
        {
            if ((ownerType != PWAElement.class) && (ownerType != PWAEventFrame.class))
            {
                throw new WebIdException("PIAttribte owner type must be a PIElement or a PIEventFrame.");
            }
        }
        else if (type == PWAAttributeTemplate.class)
        {
            if ((ownerType != PWAElementTemplate.class))
            {
                throw new WebIdException("PIElementTemplate owner type must be a PIElementTemplate.");
            }
        }
        else if ((type == PWAEnumerationSet.class) || (type == PWAEnumerationValue.class))
        {
            if ((ownerType != PWADataServer.class) && (ownerType != PWAAssetServer.class))
            {
                throw new WebIdException("PIEnumerationSet and  PIEnumerationValue owner type must be a PIDataServer or PIAssetServer.");
            }
        }
        else if (type == PWATimeRule.class)
        {
            if ((ownerType != PWAAnalysis.class) && (ownerType != PWAAnalysisTemplate.class))
            {
                throw new WebIdException("PITimeRule owner type must be a PIAnalysis and PIAnalysisTemplate.");
            }
        }
    }

    private String getOwnerMarker(Class ownerType)
    {
        String markerOwner = "";
        if (ownerType == null)
        {
            return markerOwner;
        }

        if (ownerType == PWAAssetServer.class)
        {
            markerOwner = "R";
        }
        else if (ownerType == PWADataServer.class)
        {
            markerOwner = "D";
        }
        else if (ownerType == PWAAnalysis.class)
        {
            markerOwner = "X";
        }
        else if (ownerType == PWAAnalysisTemplate.class)
        {
            markerOwner = "T";
        }
        else if (ownerType == PWAElement.class)
        {
            markerOwner = "E";
        }
        if (ownerType == PWAElementTemplate.class)
        {
            markerOwner = "E";
        }
        else if (ownerType == PWAEventFrame.class)
        {
            markerOwner = "F";
        }
        return markerOwner;
    }

    private String getMarker(Class type) throws WebIdException {
        String marker = null;
        if (type == PWAAnalysis.class)
        {
            marker = "Xs";
        }
        else if (type == PWAAnalysisCategory.class)
        {
            marker = "XC";
        }
        else if (type == PWAAnalysisTemplate.class)
        {
            marker = "XT";
        }
        else if (type == PWAAnalysisRule.class)
        {
            marker = "XR";
        }
        else if (type == PWAAnalysisRulePlugIn.class)
        {
            marker = "XP";
        }
        else if (type == PWAAttribute.class)
        {
            marker = "Ab";
        }
        else if (type == PWAAttributeCategory.class)
        {
            marker = "AC";
        }
        else if (type == PWAAttributeTemplate.class)
        {
            marker = "AT";
        }
        else if (type == PWAAssetDatabase.class)
        {
            marker = "RD";
        }
        else if (type == PWAAssetServer.class)
        {
            marker = "RS";
        }
        else if (type == PWAElement.class)
        {
            marker = "Em";
        }
        else if (type == PWAElementCategory.class)
        {
            marker = "EC";
        }
        else if (type == PWAElementTemplate.class)
        {
            marker = "ET";
        }
        else if (type == PWAEnumerationSet.class)
        {
            marker = "MS";
        }
        else if (type == PWAEnumerationValue.class)
        {
            marker = "MV";
        }
        else if (type == PWAEventFrame.class)
        {
            marker = "Fm";
        }
        else if (type == PWATimeRule.class)
        {
            marker = "TR";
        }
        else if (type == PWATimeRulePlugIn.class)
        {
            marker = "TP";
        }
        else if (type == PWASecurityIdentity.class)
        {
            marker = "SI";
        }
        else if (type == PWASecurityMapping.class)
        {
            marker = "SM";
        }
        else if (type == PWATable.class)
        {
            marker = "Bl";
        }
        else if (type == PWATableCategory.class)
        {
            marker = "BC";
        }
        else if (type == PWAPoint.class)
        {
            marker = "DP";
        }
        else if (type == PWADataServer.class)
        {
            marker = "DS";
        }
        else if (type == PWAUnit.class)
        {
            marker = "Ut";
        }
        else if (type == PWAUnitClass.class)
        {
            marker = "UC";
        }
        if (marker == null)
        {
            throw new WebIdException("Invalid object type.");
        }

        return marker;
    }

    public static String encode(String value)
    {
        byte[] bytes = value.getBytes(StandardCharsets.UTF_8);
        return encode(bytes);
    }

    public static String encode(byte[] bytes)
    {
        String value =  Base64.getEncoder().encodeToString(bytes);
        value = trimStringByString(value, "=");
        return value.replace('+', '-').replace('/', '_');
    }

    public static String encode(UUID value)
    {
        byte[] bytes = value.toString().getBytes();
        return encode(bytes);
    }

    public static String trimStringByString(String text, String trimBy) {
        int beginIndex = 0;
        int endIndex = text.length();

        while (text.substring(beginIndex, endIndex).startsWith(trimBy)) {
            beginIndex += trimBy.length();
        }

        while (text.substring(beginIndex, endIndex).endsWith(trimBy)) {
            endIndex -= trimBy.length();
        }

        return text.substring(beginIndex, endIndex);
    }

}