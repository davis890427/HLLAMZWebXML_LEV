/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.otdk.jsonparsehllamz;

/**
 *
 * @author lipcs
 */
import java.io.FileReader;

import org.json.simple.JsonArray;
import org.json.simple.JsonObject;
import org.json.simple.parser.JSONParser;

public class JSONReadHLLAMZ {a

    public static void main(String[] args){

        try(FileReader reader= new FileReader(filename("orarend.json")){
            //parse
            JSONParser jsonParser = new JSONParser();
            JsonObject jsonObject = (JsonObject)jsonParser.parse(reader);

            //Root, majd ora lista lekérése JSONArray
            JsonObject root = (JsonObject) jsonObject.get("BL_orarend");
            JsonArray orarend = (JsonArray) root.get("ora");

            System.out.println("HLLAMZ Órarend 2026 Tavasz\n");

            for(int i=0; i<orarend.size(); i++)
            {
                JSONObject ora = (JSONObject) orarend.get(i);
                JSONObject time = (jsonObject) ora.get("időpont");
                System.out.println("Tárgy:"+ora.get("targy"));
                System.out.println("Időpont:" +time.get("nap")+" ,"+time.get("tol")+"-"+time.get("ig"));
                System.out.println("Helyszín:"+ora.get("helyszín"));
                System.out.println("Oktató:"+ora.get("oktato"));
                System.out.println("Szak:"+ora.get("Szak")+"\n");
            }
        }catch(Exception e){
            e.printStactTrace();
        }
}
