import json
import os.path

print("The available types are lootTable, blockState, blockModel, and blockItem.")
jsonType = input("Enter the type of .json to be generated: ")
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

"""
if jsonType == ("confirm"):
    # lootTable .json generator
    lootTableJSON = json.dumps(lootTable, indent = 2)
    save_path = "C:\\Users\\glogm\\source\\repos\\block-compression\\src\\main\\resources\\data\\blockcompression\\loot_tables\\blocks\\"
    completeName = os.path.join(save_path, blockName + ".json")
    print(lootTableJSON)
    json = open(completeName, "w")
    json.write(lootTableJSON)
    json.close()
    print(blockName + ".json file has been created in the correct folder for lootTables.")
    
    # blockState .json generator
    blockStateJSON = json.dumps(blockState, indent = 2)
    save_path = "C:\\Users\\glogm\\source\\repos\\block-compression\\src\\main\\resources\\assets\\blockcompression\\blockstates\\"
    completeName = os.path.join(save_path, blockName + ".json")
    print(blockStateJSON)
    json = open(completeName, "w")
    json.write(blockStateJSON)
    json.close()
    print(blockName + ".json file has been created in the correct folder for blockStates.")

    # blockModel .json generator
    blockModelJSON = json.dumps(blockModel, indent = 2)
    save_path = "C:\\Users\\glogm\\source\\repos\\block-compression\\src\\main\\resources\\assets\\blockcompression\\models\\block\\"
    completeName = os.path.join(save_path, blockName + ".json")
    print(blockModelJSON)
    json = open(completeName, "w")
    json.write(blockModelJSON)
    json.close()
    print(".json file has been created in the correct folder for blockModels.")

    # blockItem .json generator
    blockItemJSON = json.dumps(blockItem, indent = 2)
    save_path = "C:\\Users\\glogm\\source\\repos\\block-compression\\src\\main\\resources\\assets\\blockcompression\\models\\item\\"
    completeName = os.path.join(save_path, blockName + ".json")
    print(blockItemJSON)
    json = open(completeName, "w")
    json.write(blockItemJSON)
    json.close()
    print(".json file has been created in the correct folder for blockItems.")

# if statements for writing to the file
"""
if jsonType == ("lootTable"):
    lootTableJSON = json.dumps(lootTable, indent = 2)
    save_path = "C:\\Users\\glogm\\source\\repos\\block-compression\\src\\main\\resources\\data\\blockcompression\\loot_tables\\blocks\\"
    completeName = os.path.join(save_path, blockName + ".json")
    print(lootTableJSON)

    json = open(completeName, "w")
    json.write(lootTableJSON)
    json.close()

    print(blockName + ".json file has been created in the correct folder for lootTables.")
    
elif jsonType == ("blockState"):
    blockStateJSON = json.dumps(blockState, indent = 2)
    save_path = "C:\\Users\\glogm\\source\\repos\\block-compression\\src\\main\\resources\\assets\\blockcompression\\blockstates\\"
    completeName = os.path.join(save_path, blockName + ".json")
    print(blockStateJSON)

    json = open(completeName, "w")
    json.write(blockStateJSON)
    json.close()

    print(blockName + ".json file has been created in the correct folder for blockStates.")

elif jsonType == ("blockModel"):
    blockModelJSON = json.dumps(blockModel, indent = 2)
    save_path = "C:\\Users\\glogm\\source\\repos\\block-compression\\src\\main\\resources\\assets\\blockcompression\\models\\block\\"
    completeName = os.path.join(save_path, blockName + ".json")
    print(blockModelJSON)

    json = open(completeName, "w")
    json.write(blockModelJSON)
    json.close()

elif jsonType == ("blockItem"):
    blockItemJSON = json.dumps(blockItem, indent = 2)
    save_path = "C:\\Users\\glogm\\source\\repos\\block-compression\\src\\main\\resources\\assets\\blockcompression\\models\\item\\"
    completeName = os.path.join(save_path, blockName + ".json")
    print(blockItemJSON)

    json = open(completeName, "w")
    json.write(blockItemJSON)
    json.close()

else:
    print("There is no need for that type of .json or you misspelled the type of .json you wanted to create.")

