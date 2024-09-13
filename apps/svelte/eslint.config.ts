import js from '@eslint/js';
import typescriptEslint from '@typescript-eslint/eslint-plugin';
import { Linter } from 'eslint';
import airbnbBase from 'eslint-config-airbnb-base';
import airbnbTypescript from 'eslint-config-airbnb-typescript';
import prettier from 'eslint-config-prettier';
import svelte from 'eslint-plugin-svelte';
import globals from 'globals';

// Define the type for ESLint configurations
const config: Linter.Config[] = [
  js.configs.recommended,
  ...svelte.configs['flat/recommended'], // Svelte recommended rules
  airbnbBase, // Airbnb base rules for JavaScript
  airbnbTypescript, // Airbnb rules for TypeScript
  typescriptEslint.configs.strict, // Strict TypeScript linting from @typescript-eslint
  prettier, // Prettier configuration to avoid formatting conflicts
  ...svelte.configs['flat/prettier'], // Svelte + Prettier integration
  {
    languageOptions: {
      globals: {
        ...globals.browser, // Browser globals like 'window', 'document', etc.
        ...globals.node, // Node.js globals like 'process', 'global', etc.
      },
    },
  },
  {
    ignores: ['build/', '.svelte-kit/', 'dist/'], // Ignore these directories
  },
];

export default config;
