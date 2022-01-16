import json
import os.path

jsonType = "true"
blockName = input("Enter block name: ")

# .json generating functions
lootTable = {
    "type": "minecraft:block",
    "pools": [
      {
        "rolls": 1,
        "bonus_rolls": 0,
        "entries": [
          {
            "type": "minecraft:item",
            "name": "blockcompression:" + blockName + ''
          }
        ]
      }
    ]
  }

blockState = {
    "variants": {
        "": {"model": "blockcompression:block/" + blockName + ''}
    }
}

blockModel = {
    "parent": "block/cube_all",
    "textures": {
        "all": "blockcompression:blocks/" + blockName + ''
    }
}

blockItem = {
    "parent": "blockcompression:block/" + blockName + ''
}

if jsonType == "true":
    # lootTable .json generator
    lootTableJSON = json.dumps(lootTable, indent = 2)
    save_path = "C:\\Users\\Nikhil Turlapati\\Documents\\block-compression\\src\\main\\resources\\data" \
                "\\blockcompression\\loot_tables\\blocks"
    completeName = os.path.join(save_path, blockName + ".json")
    print(lootTableJSON)
    j = open(completeName, "w")
    j.write(lootTableJSON)
    j.close()
    print(blockName + ".json file has been created in the correct folder for lootTables.")
    
    # blockState .json generator
    blockStateJSON = json.dumps(blockState, indent = 2)
    save_path = "C:\\Users\\Nikhil Turlapati\\Documents\\block-compression\\src\\main\\resources\\assets" \
                "\\blockcompression\\blockstates"
    completeName = os.path.join(save_path, blockName + ".json")
    print(blockStateJSON)
    j2 = open(completeName, "w")
    j2.write(blockStateJSON)
    j2.close()
    print(blockName + ".json file has been created in the correct folder for blockStates.")

    # blockModel .json generator
    blockModelJSON = json.dumps(blockModel, indent = 2)
    save_path = "C:\\Users\\Nikhil Turlapati\\Documents\\block-compression\\src\\main\\resources\\assets" \
                "\\blockcompression\\models\\block"
    completeName = os.path.join(save_path, blockName + ".json")
    print(blockModelJSON)
    j3 = open(completeName, "w")
    j3.write(blockModelJSON)
    j3.close()
    print(".json file has been created in the correct folder for blockModels.")

    # blockItem .json generator
    blockItemJSON = json.dumps(blockItem, indent = 2)
    save_path = "C:\\Users\\Nikhil Turlapati\\Documents\\block-compression\\src\\main\\resources\\assets" \
                "\\blockcompression\\models\\item"
    completeName = os.path.join(save_path, blockName + ".json")
    print(blockItemJSON)
    j4 = open(completeName, "w")
    j4.write(blockItemJSON)
    j4.close()
    print(".json file has been created in the correct folder for blockItems.")
